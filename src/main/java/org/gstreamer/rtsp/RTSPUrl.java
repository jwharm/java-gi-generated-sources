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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public org.gstreamer.rtsp.RTSPLowerTrans transports$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transports"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.rtsp.RTSPLowerTrans(RESULT);
    }
    
    /**
     * Change the value of the field {@code transports}
     * @param transports The new value of the field {@code transports}
     */
    public void transports$set(org.gstreamer.rtsp.RTSPLowerTrans transports) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transports"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transports.getValue());
    }
    
    /**
     * Get the value of the field {@code family}
     * @return The value of the field {@code family}
     */
    public org.gstreamer.rtsp.RTSPFamily family$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("family"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.rtsp.RTSPFamily.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code family}
     * @param family The new value of the field {@code family}
     */
    public void family$set(org.gstreamer.rtsp.RTSPFamily family) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("family"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), family.getValue());
    }
    
    /**
     * Get the value of the field {@code user}
     * @return The value of the field {@code user}
     */
    public java.lang.String user$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code user}
     * @param user The new value of the field {@code user}
     */
    public void user$set(java.lang.String user) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(user));
    }
    
    /**
     * Get the value of the field {@code passwd}
     * @return The value of the field {@code passwd}
     */
    public java.lang.String passwd$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passwd"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code passwd}
     * @param passwd The new value of the field {@code passwd}
     */
    public void passwd$set(java.lang.String passwd) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("passwd"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(passwd));
    }
    
    /**
     * Get the value of the field {@code host}
     * @return The value of the field {@code host}
     */
    public java.lang.String host$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("host"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code host}
     * @param host The new value of the field {@code host}
     */
    public void host$set(java.lang.String host) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("host"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(host));
    }
    
    /**
     * Get the value of the field {@code port}
     * @return The value of the field {@code port}
     */
    public short port$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("port"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code port}
     * @param port The new value of the field {@code port}
     */
    public void port$set(short port) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("port"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), port);
    }
    
    /**
     * Get the value of the field {@code abspath}
     * @return The value of the field {@code abspath}
     */
    public java.lang.String abspath$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("abspath"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code abspath}
     * @param abspath The new value of the field {@code abspath}
     */
    public void abspath$set(java.lang.String abspath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("abspath"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(abspath));
    }
    
    /**
     * Get the value of the field {@code query}
     * @return The value of the field {@code query}
     */
    public java.lang.String query$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void query$set(java.lang.String query) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(query));
    }
    
    /**
     * Create a RTSPUrl proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPUrl(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Make a copy of {@code url}.
     * @return a copy of {@code url}. Free with gst_rtsp_url_free () after usage.
     */
    public @NotNull org.gstreamer.rtsp.RTSPUrl copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_url_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.rtsp.RTSPUrl(RESULT, Ownership.FULL);
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
    public @NotNull PointerString decodePathComponents() {
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
    public @NotNull org.gstreamer.rtsp.RTSPResult getPort(Out<Short> port) {
        java.util.Objects.requireNonNull(port, "Parameter 'port' must not be null");
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
    public @NotNull java.lang.String getRequestUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_url_get_request_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get a newly allocated string describing the request URI for {@code url}
     * combined with the control path for {@code control_path}
     * @param controlPath an RTSP aggregate control path
     * @return a string with the request URI combined with the control path.
     * g_free() after usage.
     */
    public @NotNull java.lang.String getRequestUriWithControl(@NotNull java.lang.String controlPath) {
        java.util.Objects.requireNonNull(controlPath, "Parameter 'controlPath' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_url_get_request_uri_with_control.invokeExact(
                    handle(),
                    Interop.allocateNativeString(controlPath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Set the port number in {@code url} to {@code port}.
     * @param port the port
     * @return {@code GST_RTSP_OK}.
     */
    public @NotNull org.gstreamer.rtsp.RTSPResult setPort(short port) {
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
    public static @NotNull org.gstreamer.rtsp.RTSPResult parse(@NotNull java.lang.String urlstr, @NotNull Out<org.gstreamer.rtsp.RTSPUrl> url) {
        java.util.Objects.requireNonNull(urlstr, "Parameter 'urlstr' must not be null");
        java.util.Objects.requireNonNull(url, "Parameter 'url' must not be null");
        MemorySegment urlPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_url_parse.invokeExact(
                    Interop.allocateNativeString(urlstr),
                    (Addressable) urlPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        url.set(new org.gstreamer.rtsp.RTSPUrl(urlPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPUrl struct;
        
         /**
         * A {@link RTSPUrl.Build} object constructs a {@link RTSPUrl} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPUrl.allocate();
        }
        
         /**
         * Finish building the {@link RTSPUrl} struct.
         * @return A new instance of {@code RTSPUrl} with the fields 
         *         that were set in the Build object.
         */
        public RTSPUrl construct() {
            return struct;
        }
        
        /**
         * the transports allowed
         * @param transports The value for the {@code transports} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransports(org.gstreamer.rtsp.RTSPLowerTrans transports) {
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
        public Build setFamily(org.gstreamer.rtsp.RTSPFamily family) {
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
        public Build setUser(java.lang.String user) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (user == null ? MemoryAddress.NULL : Interop.allocateNativeString(user)));
            return this;
        }
        
        /**
         * the password
         * @param passwd The value for the {@code passwd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPasswd(java.lang.String passwd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passwd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (passwd == null ? MemoryAddress.NULL : Interop.allocateNativeString(passwd)));
            return this;
        }
        
        /**
         * the host
         * @param host The value for the {@code host} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHost(java.lang.String host) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("host"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (host == null ? MemoryAddress.NULL : Interop.allocateNativeString(host)));
            return this;
        }
        
        /**
         * the port
         * @param port The value for the {@code port} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPort(short port) {
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
        public Build setAbspath(java.lang.String abspath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("abspath"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (abspath == null ? MemoryAddress.NULL : Interop.allocateNativeString(abspath)));
            return this;
        }
        
        /**
         * additional query parameters
         * @param query The value for the {@code query} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setQuery(java.lang.String query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : Interop.allocateNativeString(query)));
            return this;
        }
    }
}
