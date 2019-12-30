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
package de.alpharogroup.service.rs.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * The interface {@link RestfulResource} provides crud methods
 *
 * @param <PK>
 *            the generic type of the primary key
 * @param <DO>
 *            the generic type of the domain object
 */
public interface RestfulResource<PK, DO>
{

	/**
	 * Creates an entity from the given domain object and persist it to the underlying database.
	 *
	 * @param domainObject
	 *            the domain object
	 * @return the domain object with the id from the entity.
	 */
	@POST
	@Path("/")
	DO create(DO domainObject);

	/**
	 * Deletes an entity in the underlying database from the given domain object
	 *
	 * @param domainObject
	 *            the domain object to be deleted
	 */
	@DELETE
	@Path("/delete/")
	void delete(DO domainObject);

	/**
	 * Deletes an entity with the given id.
	 *
	 * @param id
	 *            the id
	 */
	@DELETE
	@Path("/{id}")
	void deleteById(@PathParam("id") PK id);

	/**
	 * Updates the given domain object to the underlying database.
	 *
	 * @param domainObject
	 *            the domain object
	 */
	@PATCH
	@Path("/")
	void merge(DO domainObject);

	/**
	 * Read an entity with the given id and maps it to a domain object that will be returned.
	 *
	 * @param id
	 *            the id
	 * @return the domain object
	 */
	@GET
	@Path("/{id}")
	DO readById(@PathParam("id") PK id);

	/**
	 * Updates the given domain object to the underlying database.
	 *
	 * @param domainObject
	 *            the domain object
	 */
	@PUT
	@Path("/")
	void update(DO domainObject);

}
