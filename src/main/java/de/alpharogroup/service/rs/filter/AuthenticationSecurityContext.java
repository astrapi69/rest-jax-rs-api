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

import java.security.Principal;

import javax.ws.rs.core.SecurityContext;

/**
 * The class {@link AuthenticationSecurityContext} is a simple implementation of the
 * {@link SecurityContext} interface.
 */
public class AuthenticationSecurityContext implements SecurityContext
{

	/** The username. */
	private final String username;

	/**
	 * Instantiates a new {@link AuthenticationSecurityContext}.
	 *
	 * @param username
	 *            the username
	 */
	public AuthenticationSecurityContext(String username)
	{
		this.username = username;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAuthenticationScheme()
	{
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Principal getUserPrincipal()
	{

		return new Principal()
		{

			/**
			 * {@inheritDoc}
			 */
			@Override
			public String getName()
			{
				return username;
			}
		};
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isSecure()
	{
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isUserInRole(final String role)
	{
		return true;
	}

}
