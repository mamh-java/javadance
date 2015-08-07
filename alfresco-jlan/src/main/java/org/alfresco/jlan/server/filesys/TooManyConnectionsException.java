/*
 * Copyright (C) 2006-2010 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */

package org.alfresco.jlan.server.filesys;

/**
 * <p>This error indicates that too many tree connections are currently open
 * on a session. The new tree connection request will be rejected by the server.
 *
 * @author gkspencer
 */
public class TooManyConnectionsException extends Exception {

  private static final long serialVersionUID = 6353813221614206049L;

  /**
   * TooManyConnectionsException constructor.
   */
  public TooManyConnectionsException() {
    super();
  }

  /**
   * TooManyConnectionsException constructor.
   *
   * @param s java.lang.String
   */
  public TooManyConnectionsException(String s) {
    super(s);
  }
}
