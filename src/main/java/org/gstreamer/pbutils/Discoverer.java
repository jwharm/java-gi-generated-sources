package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Discoverer} is a utility object which allows to get as much
 * information as possible from one or many URIs.
 * <p>
 * It provides two APIs, allowing usage in blocking or non-blocking mode.
 * <p>
 * The blocking mode just requires calling gst_discoverer_discover_uri()
 * with the URI one wishes to discover.
 * <p>
 * The non-blocking mode requires a running {@link org.gtk.glib.MainLoop} iterating a
 * {@link org.gtk.glib.MainContext}, where one connects to the various signals, appends the
 * URIs to be processed (through gst_discoverer_discover_uri_async()) and then
 * asks for the discovery to begin (through gst_discoverer_start()).
 * By default this will use the GLib default main context unless you have
 * set a custom context using g_main_context_push_thread_default().
 * <p>
 * All the information is returned in a {@link DiscovererInfo} structure.
 */
public class Discoverer extends org.gtk.gobject.GObject {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscoverer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Discoverer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Discoverer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Discoverer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Discoverer(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.ClockTime timeout) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_new.invokeExact(timeout.getValue().longValue(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link Discoverer} with the provided timeout.
     * @param timeout timeout per file, in nanoseconds. Allowed are values between
     *     one second ({@code GST_SECOND}) and one hour (3600 * {@code GST_SECOND})
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public Discoverer(org.gstreamer.gst.ClockTime timeout) throws GErrorException {
        super(constructNew(timeout));
        this.takeOwnership();
    }
    
    /**
     * Synchronously discovers the given {@code uri}.
     * <p>
     * A copy of {@code uri} will be made internally, so the caller can safely g_free()
     * afterwards.
     * @param uri The URI to run on.
     * @return the result of the scanning. Can be {@code null} if an
     * error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gstreamer.pbutils.DiscovererInfo discoverUri(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_discover_uri.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gstreamer.pbutils.DiscovererInfo) Interop.register(RESULT, org.gstreamer.pbutils.DiscovererInfo.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Appends the given {@code uri} to the list of URIs to discoverer. The actual
     * discovery of the {@code uri} will only take place if gst_discoverer_start() has
     * been called.
     * <p>
     * A copy of {@code uri} will be made internally, so the caller can safely g_free()
     * afterwards.
     * @param uri the URI to add.
     * @return {@code true} if the {@code uri} was successfully appended to the list of pending
     * uris, else {@code false}
     */
    public boolean discoverUriAsync(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_discoverer_discover_uri_async.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Allow asynchronous discovering of URIs to take place.
     * A {@link org.gtk.glib.MainLoop} must be available for {@link Discoverer} to properly work in
     * asynchronous mode.
     */
    public void start() {
        try {
            DowncallHandles.gst_discoverer_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stop the discovery of any pending URIs and clears the list of
     * pending URIS (if any).
     */
    public void stop() {
        try {
            DowncallHandles.gst_discoverer_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Discovered} callback.
     */
    @FunctionalInterface
    public interface Discovered {
    
        /**
         * Will be emitted in async mode when all information on a URI could be
         * discovered, or an error occurred.
         * <p>
         * When an error occurs, {@code info} might still contain some partial information,
         * depending on the circumstances of the error.
         */
        void run(org.gstreamer.pbutils.DiscovererInfo info, @Nullable org.gtk.glib.Error error);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDiscoverer, MemoryAddress info, MemoryAddress error) {
            run((org.gstreamer.pbutils.DiscovererInfo) Interop.register(info, org.gstreamer.pbutils.DiscovererInfo.fromAddress).marshal(info, null), org.gtk.glib.Error.fromAddress.marshal(error, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Discovered.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted in async mode when all information on a URI could be
     * discovered, or an error occurred.
     * <p>
     * When an error occurs, {@code info} might still contain some partial information,
     * depending on the circumstances of the error.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Discoverer.Discovered> onDiscovered(Discoverer.Discovered handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("discovered", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Finished} callback.
     */
    @FunctionalInterface
    public interface Finished {
    
        /**
         * Will be emitted in async mode when all pending URIs have been processed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDiscoverer) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Finished.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted in async mode when all pending URIs have been processed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Discoverer.Finished> onFinished(Discoverer.Finished handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("finished", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SourceSetup} callback.
     */
    @FunctionalInterface
    public interface SourceSetup {
    
        /**
         * This signal is emitted after the source element has been created for, so
         * the URI being discovered, so it can be configured by setting additional
         * properties (e.g. set a proxy server for an http source, or set the device
         * and read speed for an audio cd source).
         * <p>
         * This signal is usually emitted from the context of a GStreamer streaming
         * thread.
         */
        void run(org.gstreamer.gst.Element source);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDiscoverer, MemoryAddress source) {
            run((org.gstreamer.gst.Element) Interop.register(source, org.gstreamer.gst.Element.fromAddress).marshal(source, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SourceSetup.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted after the source element has been created for, so
     * the URI being discovered, so it can be configured by setting additional
     * properties (e.g. set a proxy server for an http source, or set the device
     * and read speed for an audio cd source).
     * <p>
     * This signal is usually emitted from the context of a GStreamer streaming
     * thread.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Discoverer.SourceSetup> onSourceSetup(Discoverer.SourceSetup handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("source-setup", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Starting} callback.
     */
    @FunctionalInterface
    public interface Starting {
    
        /**
         * Will be emitted when the discover starts analyzing the pending URIs
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDiscoverer) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Starting.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Will be emitted when the discover starts analyzing the pending URIs
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Discoverer.Starting> onStarting(Discoverer.Starting handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("starting", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Discoverer.Builder} object constructs a {@link Discoverer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Discoverer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Discoverer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Discoverer}.
         * @return A new instance of {@code Discoverer} with the properties 
         *         that were set in the Builder object.
         */
        public Discoverer build() {
            return (Discoverer) org.gtk.gobject.GObject.newWithProperties(
                Discoverer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The duration (in nanoseconds) after which the discovery of an individual
         * URI will timeout.
         * <p>
         * If the discovery of a URI times out, the {@link DiscovererResult#TIMEOUT} will be
         * set on the result flags.
         * @param timeout The value for the {@code timeout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimeout(long timeout) {
            names.add("timeout");
            values.add(org.gtk.gobject.Value.create(timeout));
            return this;
        }
        
        public Builder setUseCache(boolean useCache) {
            names.add("use-cache");
            values.add(org.gtk.gobject.Value.create(useCache));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_discoverer_new = Interop.downcallHandle(
                "gst_discoverer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_discover_uri = Interop.downcallHandle(
                "gst_discoverer_discover_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_discover_uri_async = Interop.downcallHandle(
                "gst_discoverer_discover_uri_async",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_start = Interop.downcallHandle(
                "gst_discoverer_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_stop = Interop.downcallHandle(
                "gst_discoverer_stop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_discoverer_get_type = Interop.downcallHandle(
                "gst_discoverer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_discoverer_get_type != null;
    }
}
