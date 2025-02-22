/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
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
package SBI;

import org.xwiki.component.annotation.Role;

/**
 * Interface (aka Role) of the Component
 *
 * @version $Id: f585df8f56ed99e66c0d8d70a0ee1bcc075de017 $
 */
@Role
public interface HelloWorld
{
    /**
     * Says hello by returning a greeting to the caller.
     *
     * @return a greeting
     */
    String sayHello();
}

