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
package de.alpharogroup.service.rs.providers;

import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jaxrs.Jaxrs2TypesModule;
import com.fasterxml.jackson.jaxrs.cfg.Annotations;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * The class {@link CustomTypeModulesRegistrationProvider} extends the {@link JacksonJsonProvider}
 * and register the module {@link Jaxrs2TypesModule}.
 */
@Provider
public class CustomTypeModulesRegistrationProvider extends JacksonJsonProvider
{

	/**
	 * Instantiation block.
	 */
	{
		ObjectMapper mapper = newTypeModulesRegistration();
		setMapper(mapper);
	}

	/**
	 * Instantiates a new {@link CustomTypeModulesRegistrationProvider} object.
	 */
	public CustomTypeModulesRegistrationProvider()
	{
	}

	/**
	 * Instantiates a new new {@link CustomTypeModulesRegistrationProvider} object with the given
	 * parameters.
	 *
	 * @param annotationsToUse
	 *            Annotation set(s) to use for configuring data binding
	 */
	public CustomTypeModulesRegistrationProvider(Annotations... annotationsToUse)
	{
		super(annotationsToUse);
	}

	/**
	 * Instantiates a new {@link CustomTypeModulesRegistrationProvider} object with the given
	 * parameters.
	 *
	 * @param mapper
	 *            the object mapper
	 */
	public CustomTypeModulesRegistrationProvider(ObjectMapper mapper)
	{
		super(mapper);
	}

	/**
	 * Instantiates a new new {@link CustomTypeModulesRegistrationProvider} object with the given
	 * parameters.
	 *
	 * @param mapper
	 *            the object mapper
	 * @param annotationsToUse
	 *            Sets of annotations (Jackson, JAXB) that provider should support
	 */
	public CustomTypeModulesRegistrationProvider(ObjectMapper mapper,
		Annotations[] annotationsToUse)
	{
		super(mapper, annotationsToUse);
	}

	/**
	 * Factory callback method for registration of new type modules. This method is invoked in the
	 * constructor and can be overridden so users can add specific type modules for the specific
	 * provider.
	 *
	 * @return the object mapper
	 */
	protected ObjectMapper newTypeModulesRegistration()
	{
		ObjectMapper mapper = _mapperConfig.getConfiguredMapper();
		if (mapper == null)
		{
			mapper = _mapperConfig.getDefaultMapper();
		}
		mapper.registerModule(new Jaxrs2TypesModule());
		return mapper;
	}

}