package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides helper functions to handle RTSP urls.
 */
public class RTSPUrl extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPUrl";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("transports"),
            Interop.valueLayout.C_INT.withName("family"),
            Interop.valueLayout.ADDRESS.withName("user"),
            Interop.valueLayout.ADDRESS.withName("passwd"),
            Interop.valueLayout.ADDRESS.withName("host"),
            Interop.valueLayout.C_SHORT.withName("port"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("abspath"),
            Interop.valueLayout.ADDRESS.withName("query")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPUrl}
     * @return A new, uninitialized @{link RTSPUrl}
     */
    public static RTSPUrl allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPUrl newInstance = new RTSPUrl(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code transports}
     * @return The value of the field {@code transports}
     */
    public org.gstreamer.rtsp.RTSPLowerTrans getTransports() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transports"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPLowerTrans(RESULT);
    }
    
    /**
     * Change the value of the field {@code transports}
     * @param transports The new value of the field {@code transports}
     */
    public void setTransports(org.gstreamer.rtsp.RTSPLowerTrans transports) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transports"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transports == null ? MemoryAddress.NULL : transports.getValue()));
    }
    
    /**
     * Get the value of the field {@code family}
     * @return The value of the field {@code family}
     */
    public org.gstreamer.rtsp.RTSPFamily getFamily() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("family"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.rtsp.RTSPFamily.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code family}
     * @param family The new value of the field {@code family}
     */
    public void setFamily(org.gstreamer.rtsp.RTSPFamily family) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("family"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (family == null ? MemoryAddress.NULL : family.getValue()));
    }
    
    /**
     * Get the value of the field {@code user}
     * @return The value of the field {@code user}
     */
    public java.lang.String getUser() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code user}
     * @param user The new value of the field {@code user}
     */
    public void setUser(java.lang.String user) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (user == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(user, null)));
    }
    
    /**
     * Get the value of the field {@code passwd}
     * @return The value of the field {@code passwd}
     */
    public java.lang.String getPasswd() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passwd"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code passwd}
     * @param passwd The new value of the field {@code passwd}
     */
    public void setPasswd(java.lang.String passwd) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passwd"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (passwd == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(passwd, null)));
    }
    
    /**
     * Get the value of the field {@code host}
     * @return The value of the field {@code host}
     */
    public java.lang.String getHost() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("host"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code host}
     * @param host The new value of the field {@code host}
     */
    public void setHost(java.lang.String host) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("host"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, null)));
    }
    
    /**
     * Get the value of the field {@code port}
     * @return The value of the field {@code port}
     */
    public short getPort_() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("port"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code port}
     * @param port The new value of the field {@code port}
     */
    public void setPort_(short port) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("port"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), port);
    }
    
    /**
     * Get the value of the field {@code abspath}
     * @return The value of the field {@code abspath}
     */
    public java.lang.String getAbspath() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("abspath"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code abspath}
     * @param abspath The new value of the field {@code abspath}
     */
    public void setAbspath(java.lang.String abspath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("abspath"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (abspath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(abspath, null)));
    }
    
    /**
     * Get the value of the field {@code query}
     * @return The value of the field {@code query}
     */
    public java.lang.String getQuery() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(java.lang.String query) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, null)));
    }
    
    /**
     * Create a RTSPUrl proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTSPUrl(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPUrl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTSPUrl(input, ownership);
    
    /**
     * Make a copy of {@code url}.
     * @return a copy of {@code url}. Free with gst_rtsp_url_free () after usage.
     */
    public org.gstreamer.rtsp.RTSPUrl copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_url_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPUrl.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Splits the path of {@code url} on '/' boundaries, decoding the resulting components,
     * <p>
     * The decoding performed by this routine is "URI decoding", as defined in RFC
     * 3986, commonly known as percent-decoding. For example, a string "foo\\{@code 2fbar}"
     * will decode to "foo/bar" -- the \\{@code 2f} being replaced by the corresponding byte
     * with hex value 0x2f. Note that there is no guarantee that the resulting byte
     * sequence is valid in any given encoding. As a special case, \\{@code 00} is not
     * unescaped to NUL, as that would prematurely terminate the string.
     * <p>
     * Also note that since paths usually start with a slash, the first component
     * will usually be the empty string.
     * @return {@code null}-terminated array of URL components. Free with
     * g_strfreev() when no longer needed.
     */
    public PointerString decodePathComponents() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_url_decode_path_components.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Free the memory used by {@code url}.
     */
    public void free() {
        try {
            DowncallHandles.gst_rtsp_url_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the port number of {@code url}.
     * @param port location to hold the port
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult getPort(Out<Short> port) {
        MemorySegment portPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_url_get_port.invokeExact(
                    handle(),
                    (Addressable) portPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        port.set(portPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Get a newly allocated string describing the request URI for {@code url}.
     * @return a string with the request URI. g_free() after usage.
     */
    public java.lang.String getRequestUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_url_get_request_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get a newly allocated string describing the request URI for {@code url}
     * combined with the control path for {@code control_path}
     * @param controlPath an RTSP aggregate control path
     * @return a string with the request URI combined with the control path.
     * g_free() after usage.
     */
    public java.lang.String getRequestUriWithControl(java.lang.String controlPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_url_get_request_uri_with_control.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(controlPath, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Set the port number in {@code url} to {@code port}.
     * @param port the port
     * @return {@code GST_RTSP_OK}.
     */
    public org.gstreamer.rtsp.RTSPResult setPort(short port) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_url_set_port.invokeExact(
                    handle(),
                    port);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Parse the RTSP {@code urlstr} into a newly allocated {@link RTSPUrl}. Free after usage
     * with gst_rtsp_url_free().
     * @param urlstr the url string to parse
     * @param url location to hold the result.
     * @return a {@link RTSPResult}.
     */
    public static org.gstreamer.rtsp.RTSPResult parse(java.lang.String urlstr, Out<org.gstreamer.rtsp.RTSPUrl> url) {
        MemorySegment urlPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_url_parse.invokeExact(
                    Marshal.stringToAddress.marshal(urlstr, null),
                    (Addressable) urlPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        url.set(org.gstreamer.rtsp.RTSPUrl.fromAddress.marshal(urlPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_url_copy = Interop.downcallHandle(
            "gst_rtsp_url_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_decode_path_components = Interop.downcallHandle(
            "gst_rtsp_url_decode_path_components",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_free = Interop.downcallHandle(
            "gst_rtsp_url_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_get_port = Interop.downcallHandle(
            "gst_rtsp_url_get_port",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_get_request_uri = Interop.downcallHandle(
            "gst_rtsp_url_get_request_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_get_request_uri_with_control = Interop.downcallHandle(
            "gst_rtsp_url_get_request_uri_with_control",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_set_port = Interop.downcallHandle(
            "gst_rtsp_url_set_port",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_rtsp_url_parse = Interop.downcallHandle(
            "gst_rtsp_url_parse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link RTSPUrl.Builder} object constructs a {@link RTSPUrl} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPUrl.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPUrl struct;
        
        private Builder() {
            struct = RTSPUrl.allocate();
        }
        
         /**
         * Finish building the {@link RTSPUrl} struct.
         * @return A new instance of {@code RTSPUrl} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPUrl build() {
            return struct;
        }
        
        /**
         * the transports allowed
         * @param transports The value for the {@code transports} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransports(org.gstreamer.rtsp.RTSPLowerTrans transports) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transports"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transports == null ? MemoryAddress.NULL : transports.getValue()));
            return this;
        }
        
        /**
         * the family
         * @param family The value for the {@code family} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFamily(org.gstreamer.rtsp.RTSPFamily family) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("family"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (family == null ? MemoryAddress.NULL : family.getValue()));
            return this;
        }
        
        /**
         * the user
         * @param user The value for the {@code user} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUser(java.lang.String user) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (user == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(user, null)));
            return this;
        }
        
        /**
         * the password
         * @param passwd The value for the {@code passwd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPasswd(java.lang.String passwd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passwd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (passwd == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(passwd, null)));
            return this;
        }
        
        /**
         * the host
         * @param host The value for the {@code host} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHost(java.lang.String host) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("host"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, null)));
            return this;
        }
        
        /**
         * the port
         * @param port The value for the {@code port} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPort(short port) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("port"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), port);
            return this;
        }
        
        /**
         * the absolute path
         * @param abspath The value for the {@code abspath} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAbspath(java.lang.String abspath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("abspath"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (abspath == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(abspath, null)));
            return this;
        }
        
        /**
         * additional query parameters
         * @param query The value for the {@code query} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setQuery(java.lang.String query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, null)));
            return this;
        }
    }
}
