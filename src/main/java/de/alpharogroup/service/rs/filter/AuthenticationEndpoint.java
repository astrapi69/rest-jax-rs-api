/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.service.rs.filter;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/authentication")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public abstract class AuthenticationEndpoint
{

	/**
	 * Authenticate against your user-management-system.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 * @throws Exception
	 *             is thrown if the credentials are not valid
	 */
	protected abstract void authenticate(String username, String password) throws Exception;

	/**
	 * Authenticate user.
	 *
	 * @param username
	 *            the username
	 * @param password
	 *            the password
	 * @return the response
	 */
	@POST
	public Response authenticateUser(@FormParam("username") String username,
		@FormParam("password") String password)
	{
		try
		{

			// Authenticate the given user
			authenticate(username, password);

			// Create a new token for the given user
			String token = newToken(username);

			// Set the token on the response and return it
			return Response.ok(token).build();

		}
		catch (Exception e)
		{
			return Response.status(Response.Status.UNAUTHORIZED).build();
		}
	}

	/**
	 * Create a new token that is associated with the given username.
	 *
	 * @param username
	 *            the username
	 * @return the new token that is associated with the given username.
	 */
	protected abstract String newToken(String username);
}