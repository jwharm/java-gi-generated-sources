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
public class Discoverer extends org.gtk.gobject.Object {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscoverer";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a Discoverer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Discoverer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Discoverer if its GType is a (or inherits from) "GstDiscoverer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Discoverer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDiscoverer", a ClassCastException will be thrown.
     */
    public static Discoverer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Discoverer.getType())) {
            return new Discoverer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDiscoverer");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.ClockTime timeout) throws GErrorException {
        java.util.Objects.requireNonNull(timeout, "Parameter 'timeout' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_new.invokeExact(
                    timeout.getValue().longValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Discoverer} with the provided timeout.
     * @param timeout timeout per file, in nanoseconds. Allowed are values between
     *     one second ({@code GST_SECOND}) and one hour (3600 * {@code GST_SECOND})
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public Discoverer(@NotNull org.gstreamer.gst.ClockTime timeout) throws GErrorException {
        super(constructNew(timeout), Ownership.FULL);
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
    public @NotNull org.gstreamer.pbutils.DiscovererInfo discoverUri(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_discoverer_discover_uri.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.pbutils.DiscovererInfo(RESULT, Ownership.FULL);
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
    public boolean discoverUriAsync(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_discoverer_discover_uri_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Allow asynchronous discovering of URIs to take place.
     * A {@link org.gtk.glib.MainLoop} must be available for {@link Discoverer} to properly work in
     * asynchronous mode.
     */
    public void start() {
        try {
            DowncallHandles.gst_discoverer_start.invokeExact(
                    handle());
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
            DowncallHandles.gst_discoverer_stop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_discoverer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Discovered {
        void signalReceived(Discoverer sourceDiscoverer, @NotNull org.gstreamer.pbutils.DiscovererInfo info, @Nullable org.gtk.glib.Error error);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("discovered"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Discoverer.Callbacks.class, "signalDiscovererDiscovered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Discoverer.Discovered>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Finished {
        void signalReceived(Discoverer sourceDiscoverer);
    }
    
    /**
     * Will be emitted in async mode when all pending URIs have been processed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Discoverer.Finished> onFinished(Discoverer.Finished handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("finished"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Discoverer.Callbacks.class, "signalDiscovererFinished",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Discoverer.Finished>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SourceSetup {
        void signalReceived(Discoverer sourceDiscoverer, @NotNull org.gstreamer.gst.Element source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("source-setup"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Discoverer.Callbacks.class, "signalDiscovererSourceSetup",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Discoverer.SourceSetup>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Starting {
        void signalReceived(Discoverer sourceDiscoverer);
    }
    
    /**
     * Will be emitted when the discover starts analyzing the pending URIs
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Discoverer.Starting> onStarting(Discoverer.Starting handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("starting"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Discoverer.Callbacks.class, "signalDiscovererStarting",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Discoverer.Starting>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Discoverer.Build} object constructs a {@link Discoverer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Discoverer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Discoverer} using {@link Discoverer#castFrom}.
         * @return A new instance of {@code Discoverer} with the properties 
         *         that were set in the Build object.
         */
        public Discoverer construct() {
            return Discoverer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Discoverer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setTimeout(long timeout) {
            names.add("timeout");
            values.add(org.gtk.gobject.Value.create(timeout));
            return this;
        }
        
        public Build setUseCache(boolean useCache) {
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
    
    private static class Callbacks {
        
        public static void signalDiscovererDiscovered(MemoryAddress sourceDiscoverer, MemoryAddress info, MemoryAddress error, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Discoverer.Discovered) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Discoverer(sourceDiscoverer, Ownership.NONE), new org.gstreamer.pbutils.DiscovererInfo(info, Ownership.NONE), new org.gtk.glib.Error(error, Ownership.NONE));
        }
        
        public static void signalDiscovererFinished(MemoryAddress sourceDiscoverer, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Discoverer.Finished) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Discoverer(sourceDiscoverer, Ownership.NONE));
        }
        
        public static void signalDiscovererSourceSetup(MemoryAddress sourceDiscoverer, MemoryAddress source, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Discoverer.SourceSetup) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Discoverer(sourceDiscoverer, Ownership.NONE), new org.gstreamer.gst.Element(source, Ownership.NONE));
        }
        
        public static void signalDiscovererStarting(MemoryAddress sourceDiscoverer, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Discoverer.Starting) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Discoverer(sourceDiscoverer, Ownership.NONE));
        }
    }
}
