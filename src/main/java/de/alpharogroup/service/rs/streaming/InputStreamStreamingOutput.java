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
package de.alpharogroup.service.rs.streaming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import lombok.NonNull;

/**
 * The class {@link InputStreamStreamingOutput} can be used for put an {@link InputStream} to a
 * {@link Response} object.
 */
public class InputStreamStreamingOutput implements StreamingOutput
{

	/** The input stream */
	private final InputStream inputStream;

	/**
	 * Instantiates a new {@link InputStreamStreamingOutput} object
	 *
	 * @param input
	 *            the input stream
	 */
	public InputStreamStreamingOutput(final @NonNull InputStream input)
	{
		this.inputStream = input;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void write(final @NonNull OutputStream output)
		throws IOException, WebApplicationException
	{
		int bytesRead;
		byte[] buffer = new byte[4096];
		while ((bytesRead = this.inputStream.read(buffer)) != -1)
		{
			output.write(buffer, 0, bytesRead);
		}
	}

}