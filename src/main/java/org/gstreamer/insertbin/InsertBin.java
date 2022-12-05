package org.gstreamer.insertbin;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This element is a {@link org.gstreamer.gst.Bin} that has a single source and sink pad. It allows
 * the user (the application) to easily add and remove filter-like element
 * (that has a single source and sink pad), to the pipeline while it is running.
 * It features a fully asynchronous API inspired by GLib's GAsyncResult based
 * APIs.
 * <p>
 * Each operation (addition or removal) can take a callback, this callback
 * is guaranteed to be called. Unlike GIO, there is no guarantee about where
 * this callback will be called from, it could be called before the action
 * returns or it could be called later from another thread. The signature of
 * this callback GstInsertBinCallback().
 * @version 1.2
 */
public class InsertBin extends org.gstreamer.gst.Bin implements org.gstreamer.gst.ChildProxy {
    
    static {
        GstInsertBin.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstInsertBin";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Bin.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a InsertBin proxy instance for the provided memory address.
     * <p>
     * Because InsertBin is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InsertBin(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to InsertBin if its GType is a (or inherits from) "GstInsertBin".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code InsertBin} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstInsertBin", a ClassCastException will be thrown.
     */
    public static InsertBin castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), InsertBin.getType())) {
            return new InsertBin(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstInsertBin");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String name) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_insert_bin_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link InsertBin}
     * @param name The name of the new {@link InsertBin} element (or {@code null})
     */
    public InsertBin(@Nullable java.lang.String name) {
        super(constructNew(name), Ownership.NONE);
    }
    
    /**
     * This action signal adds the filter like element after any other element
     * in the bin.
     * <p>
     * Same as the {@link InsertBin}::append signal.
     * @param element the {@link org.gstreamer.gst.Element} to add
     * @param callback the callback to call when the element has been
     *  added or not, or {@code null}
     */
    public void append(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.insertbin.InsertBinCallback callback) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_insert_bin_append.invokeExact(
                    handle(),
                    element.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstInsertBin.Callbacks.class, "cbInsertBinCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This action signal adds the filter like element after the {@code sibling}
     * element in the bin.
     * <p>
     * Same as the {@link InsertBin}::insert-after signal.
     * @param element the {@link org.gstreamer.gst.Element} to add
     * @param sibling the {@link org.gstreamer.gst.Element} to add {@code element} after
     * @param callback the callback to call when the element has been
     *  added or not, or {@code null}
     */
    public void insertAfter(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Element sibling, @NotNull org.gstreamer.insertbin.InsertBinCallback callback) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_insert_bin_insert_after.invokeExact(
                    handle(),
                    element.handle(),
                    sibling.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstInsertBin.Callbacks.class, "cbInsertBinCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This action signal adds the filter like element before the {@code sibling}
     * element in the bin.
     * <p>
     * Same as the {@link InsertBin}::insert-before signal.
     * @param element the {@link org.gstreamer.gst.Element} to add
     * @param sibling the {@link org.gstreamer.gst.Element} to add {@code element} before
     * @param callback the callback to call when the element has been
     *  added or not, or {@code null}
     */
    public void insertBefore(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Element sibling, @NotNull org.gstreamer.insertbin.InsertBinCallback callback) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_insert_bin_insert_before.invokeExact(
                    handle(),
                    element.handle(),
                    sibling.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstInsertBin.Callbacks.class, "cbInsertBinCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This action signal adds the filter like element before any other element
     * in the bin.
     * <p>
     * Same as the {@link InsertBin}::prepend signal.
     * @param element the {@link org.gstreamer.gst.Element} to add
     * @param callback the callback to call when the element has been
     *  added or not, or {@code null}
     */
    public void prepend(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.insertbin.InsertBinCallback callback) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_insert_bin_prepend.invokeExact(
                    handle(),
                    element.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstInsertBin.Callbacks.class, "cbInsertBinCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This action signal removed the filter like element from the bin.
     * <p>
     * Same as the {@link InsertBin}::remove signal.
     * @param element the {@link org.gstreamer.gst.Element} to remove
     * @param callback the callback to call when the element has been
     *  removed or not, or {@code null}
     */
    public void remove(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.insertbin.InsertBinCallback callback) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gst_insert_bin_remove.invokeExact(
                    handle(),
                    element.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstInsertBin.Callbacks.class, "cbInsertBinCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
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
            RESULT = (long) DowncallHandles.gst_insert_bin_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Append {
        void signalReceived(InsertBin sourceInsertBin, @NotNull org.gstreamer.gst.Element callback, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable java.lang.foreign.MemoryAddress userData2);
    }
    
    /**
     * This action signal adds the filter like element after any other element
     * in the bin.
     * <p>
     * Same as gst_insert_bin_append()
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<InsertBin.Append> onAppend(InsertBin.Append handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("append"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InsertBin.Callbacks.class, "signalInsertBinAppend",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InsertBin.Append>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertAfter {
        void signalReceived(InsertBin sourceInsertBin, @NotNull org.gstreamer.gst.Element sibling, @NotNull org.gstreamer.gst.Element callback, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable java.lang.foreign.MemoryAddress userData2);
    }
    
    /**
     * This action signal adds the filter like element after the {@code sibling}
     * element in the bin.
     * element in the bin.
     * <p>
     * Same as gst_insert_bin_insert_after()
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<InsertBin.InsertAfter> onInsertAfter(InsertBin.InsertAfter handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-after"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InsertBin.Callbacks.class, "signalInsertBinInsertAfter",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InsertBin.InsertAfter>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertBefore {
        void signalReceived(InsertBin sourceInsertBin, @NotNull org.gstreamer.gst.Element sibling, @NotNull org.gstreamer.gst.Element callback, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable java.lang.foreign.MemoryAddress userData2);
    }
    
    /**
     * This action signal adds the filter like element before the {@code sibling}
     * element in the bin.
     * <p>
     * Same as gst_insert_bin_insert_before()
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<InsertBin.InsertBefore> onInsertBefore(InsertBin.InsertBefore handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-before"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InsertBin.Callbacks.class, "signalInsertBinInsertBefore",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InsertBin.InsertBefore>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Prepend {
        void signalReceived(InsertBin sourceInsertBin, @NotNull org.gstreamer.gst.Element callback, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable java.lang.foreign.MemoryAddress userData2);
    }
    
    /**
     * This action signal adds the filter like element before any other element
     * in the bin.
     * <p>
     * Same as gst_insert_bin_prepend()
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<InsertBin.Prepend> onPrepend(InsertBin.Prepend handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("prepend"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InsertBin.Callbacks.class, "signalInsertBinPrepend",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InsertBin.Prepend>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Remove {
        void signalReceived(InsertBin sourceInsertBin, @NotNull org.gstreamer.gst.Element callback, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable java.lang.foreign.MemoryAddress userData2);
    }
    
    /**
     * This action signal removed the filter like element from the bin.
     * <p>
     * Same as gst_insert_bin_remove()
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<InsertBin.Remove> onRemove(InsertBin.Remove handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("remove"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(InsertBin.Callbacks.class, "signalInsertBinRemove",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<InsertBin.Remove>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Bin.Build {
        
         /**
         * A {@link InsertBin.Build} object constructs a {@link InsertBin} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link InsertBin} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InsertBin} using {@link InsertBin#castFrom}.
         * @return A new instance of {@code InsertBin} with the properties 
         *         that were set in the Build object.
         */
        public InsertBin construct() {
            return InsertBin.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    InsertBin.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_insert_bin_new = Interop.downcallHandle(
            "gst_insert_bin_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_insert_bin_append = Interop.downcallHandle(
            "gst_insert_bin_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_insert_bin_insert_after = Interop.downcallHandle(
            "gst_insert_bin_insert_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_insert_bin_insert_before = Interop.downcallHandle(
            "gst_insert_bin_insert_before",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_insert_bin_prepend = Interop.downcallHandle(
            "gst_insert_bin_prepend",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_insert_bin_remove = Interop.downcallHandle(
            "gst_insert_bin_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_insert_bin_get_type = Interop.downcallHandle(
            "gst_insert_bin_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalInsertBinAppend(MemoryAddress sourceInsertBin, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InsertBin.Append) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InsertBin(sourceInsertBin, Ownership.NONE), new org.gstreamer.gst.Element(callback, Ownership.NONE), userData, userData2);
        }
        
        public static void signalInsertBinInsertAfter(MemoryAddress sourceInsertBin, MemoryAddress sibling, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InsertBin.InsertAfter) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InsertBin(sourceInsertBin, Ownership.NONE), new org.gstreamer.gst.Element(sibling, Ownership.NONE), new org.gstreamer.gst.Element(callback, Ownership.NONE), userData, userData2);
        }
        
        public static void signalInsertBinInsertBefore(MemoryAddress sourceInsertBin, MemoryAddress sibling, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InsertBin.InsertBefore) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InsertBin(sourceInsertBin, Ownership.NONE), new org.gstreamer.gst.Element(sibling, Ownership.NONE), new org.gstreamer.gst.Element(callback, Ownership.NONE), userData, userData2);
        }
        
        public static void signalInsertBinPrepend(MemoryAddress sourceInsertBin, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InsertBin.Prepend) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InsertBin(sourceInsertBin, Ownership.NONE), new org.gstreamer.gst.Element(callback, Ownership.NONE), userData, userData2);
        }
        
        public static void signalInsertBinRemove(MemoryAddress sourceInsertBin, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InsertBin.Remove) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new InsertBin(sourceInsertBin, Ownership.NONE), new org.gstreamer.gst.Element(callback, Ownership.NONE), userData, userData2);
        }
    }
}
