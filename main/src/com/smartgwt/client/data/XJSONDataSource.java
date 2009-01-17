/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.data;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
   /**
    * A DataSource preconfigured to use the ${isc.DocUtils.linkForRef('type:RPCTransport','"scriptInclude"')} transport for cross-domain calls to JSON services, such as those provided by <a href='http://developer.yahoo.net/common/json.html#callbackparam' onclick="window.open('http://developer.yahoo.net/common/json.html#callbackparam');return false;">Yahoo</a>. <P> To use this DataSource, provide the URL of the service as {@link com.smartgwt.client.data.DataSource#getDataURL dataURL}, and provide {@link com.smartgwt.client.data.DataSource#getFields fields} that describe the structure of the part of the returned data that you would like to use. <P> {@link com.smartgwt.client.data.DataSource#getRecordXPath recordXPath} and {@link com.smartgwt.client.data.DataSourceField#getValueXPath valueXPath} can be used to extract data from the structure returned by the service. <P> This XJSONDataSource is really a subclass of DataSource with just a few property settings: <pre>    dataFormat : "json",    dataTransport : "scriptInclude"    callbackParam : "callback" </pre> <P> NOTE: if you use this DataSource to contact Yahoo web services, remember to include output=json in the dataURL, as well as a <a href='http://developer.yahoo.net/' onclick="window.open('http://developer.yahoo.net/');return false;">Yahoo developer ID</a>.

    */
public class XJSONDataSource extends DataSource {

    public static XJSONDataSource getOrCreateRef(JavaScriptObject jsObj) {
        BaseClass obj = BaseClass.getRef(jsObj);
        if(obj != null) {

            return (XJSONDataSource) obj;
        } else {
            return new XJSONDataSource(jsObj);
        }
    }


    public XJSONDataSource(){
        
    }

    public XJSONDataSource(JavaScriptObject jsObj){
        super(jsObj);
    }

    public native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.core.BaseClass::getConfig()();
        return $wnd.isc.XJSONDataSource.create(config);
    }-*/;
    // ********************* Properties / Attributes ***********************

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************

}




