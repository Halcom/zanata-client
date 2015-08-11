/*
 * Copyright 2014, Red Hat, Inc. and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.zanata.rest.service;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.zanata.common.LocaleId;
import org.zanata.rest.dto.Glossary;

/**
 * @author Patrick Huang
 *         <a href="mailto:pahuang@redhat.com">pahuang@redhat.com</a>
 */
@Path(GlossaryResource.SERVICE_PATH)
public class MockGlossaryResource implements GlossaryResource {
    @Context
    UriInfo uriInfo;

    @Override
    public Response getEntries() {
        return MockResourceUtil.notUsedByClient();
    }

    @Override
    public Response getLocaleStatistic() {
        return null;
    }

    @Override
    public Response get(LocaleId localeId, LocaleId localeId1, int i, int i1) {
        return MockResourceUtil.notUsedByClient();
    }

    @Override
    public Response put(Glossary messageBody) {
        return Response.created(uriInfo.getAbsolutePath()).build();
    }

    @Override
    public Response deleteGlossary(LocaleId locale) {
        return Response.ok().build();
    }

    @Override
    public Response deleteGlossary(LocaleId localeId, String s) {
        return MockResourceUtil.notUsedByClient();
    }

    @Override
    public Response deleteGlossaries() {
        return Response.ok().build();
    }
}

