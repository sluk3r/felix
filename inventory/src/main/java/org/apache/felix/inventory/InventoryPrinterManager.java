/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.felix.inventory;

/**
 * The manager allows to access inventory printers.
 * Instead of directly returning a inventory printer, a inventory
 * printer handler is returned which provides access to the
 * meta information of the printer and other utility methods.
 */
public interface InventoryPrinterManager {

    /**
     * Get all inventory printer handlers.
     * @return A list of handlers - might be empty.
     */
    InventoryPrinterHandler[] getAllHandlers();

    /**
     * Get all handlers supporting the mode.
     * @return A list of handlers - might be empty.
     */
    InventoryPrinterHandler[] getHandlers( final PrinterMode mode);

    /**
     * Return a handler for the unique name.
     * @return The corresponding handler or <code>null</code>.
     */
    InventoryPrinterHandler getHandler( final String name );
}
