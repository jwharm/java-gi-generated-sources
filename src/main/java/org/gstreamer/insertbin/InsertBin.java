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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Bin.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a InsertBin proxy instance for the provided memory address.
     * <p>
     * Because InsertBin is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected InsertBin(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, InsertBin> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new InsertBin(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_insert_bin_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
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
    public void append(org.gstreamer.gst.Element element, org.gstreamer.insertbin.InsertBinCallback callback) {
        try {
            DowncallHandles.gst_insert_bin_append.invokeExact(
                    handle(),
                    element.handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void insertAfter(org.gstreamer.gst.Element element, org.gstreamer.gst.Element sibling, org.gstreamer.insertbin.InsertBinCallback callback) {
        try {
            DowncallHandles.gst_insert_bin_insert_after.invokeExact(
                    handle(),
                    element.handle(),
                    sibling.handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void insertBefore(org.gstreamer.gst.Element element, org.gstreamer.gst.Element sibling, org.gstreamer.insertbin.InsertBinCallback callback) {
        try {
            DowncallHandles.gst_insert_bin_insert_before.invokeExact(
                    handle(),
                    element.handle(),
                    sibling.handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void prepend(org.gstreamer.gst.Element element, org.gstreamer.insertbin.InsertBinCallback callback) {
        try {
            DowncallHandles.gst_insert_bin_prepend.invokeExact(
                    handle(),
                    element.handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void remove(org.gstreamer.gst.Element element, org.gstreamer.insertbin.InsertBinCallback callback) {
        try {
            DowncallHandles.gst_insert_bin_remove.invokeExact(
                    handle(),
                    element.handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
            RESULT = (long) DowncallHandles.gst_insert_bin_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Append {
        void run(org.gstreamer.gst.Element callback);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceInsertBin, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2) {
            run((org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(callback)), org.gstreamer.gst.Element.fromAddress).marshal(callback, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Append.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("append"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertAfter {
        void run(org.gstreamer.gst.Element sibling, org.gstreamer.gst.Element callback);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceInsertBin, MemoryAddress sibling, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2) {
            run((org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sibling)), org.gstreamer.gst.Element.fromAddress).marshal(sibling, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(callback)), org.gstreamer.gst.Element.fromAddress).marshal(callback, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InsertAfter.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("insert-after"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertBefore {
        void run(org.gstreamer.gst.Element sibling, org.gstreamer.gst.Element callback);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceInsertBin, MemoryAddress sibling, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2) {
            run((org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sibling)), org.gstreamer.gst.Element.fromAddress).marshal(sibling, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(callback)), org.gstreamer.gst.Element.fromAddress).marshal(callback, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InsertBefore.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("insert-before"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Prepend {
        void run(org.gstreamer.gst.Element callback);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceInsertBin, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2) {
            run((org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(callback)), org.gstreamer.gst.Element.fromAddress).marshal(callback, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Prepend.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("prepend"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Remove {
        void run(org.gstreamer.gst.Element callback);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceInsertBin, MemoryAddress callback, MemoryAddress userData, MemoryAddress userData2) {
            run((org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(callback)), org.gstreamer.gst.Element.fromAddress).marshal(callback, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Remove.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("remove"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link InsertBin.Builder} object constructs a {@link InsertBin} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link InsertBin.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Bin.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link InsertBin} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link InsertBin}.
         * @return A new instance of {@code InsertBin} with the properties 
         *         that were set in the Builder object.
         */
        public InsertBin build() {
            return (InsertBin) org.gtk.gobject.GObject.newWithProperties(
                InsertBin.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
}
