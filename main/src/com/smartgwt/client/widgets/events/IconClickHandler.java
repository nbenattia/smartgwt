/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.events;
import com.google.gwt.event.shared.EventHandler;

public interface IconClickHandler extends EventHandler {
    /**
     * If this button is showing an {@link com.smartgwt.client.widgets.StretchImgButton#getIcon icon}, a separate click handler
     * for the icon may be defined as <code>this.iconClick</code>. Returning false will suppress the standard button click
     * handling code.
     *
     * @param event the event
     */
    void onIconClick(com.smartgwt.client.widgets.events.IconClickEvent event);
}
