package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ListModel}.
 * @version 2.44
 */
public class ListModelInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GListModelInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("get_item_type"),
            Interop.valueLayout.ADDRESS.withName("get_n_items"),
            Interop.valueLayout.ADDRESS.withName("get_item")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ListModelInterface}
     * @return A new, uninitialized @{link ListModelInterface}
     */
    public static ListModelInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ListModelInterface newInstance = new ListModelInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface GetItemTypeCallback {
        org.gtk.glib.Type run(org.gtk.gio.ListModel list);

        @ApiStatus.Internal default long upcall(MemoryAddress list) {
            var RESULT = run((org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(list)), org.gtk.gio.ListModel.fromAddress).marshal(list, Ownership.NONE));
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetItemTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_item_type}
     * @param getItemType The new value of the field {@code get_item_type}
     */
    public void setGetItemType(GetItemTypeCallback getItemType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_item_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItemType == null ? MemoryAddress.NULL : getItemType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNItemsCallback {
        int run(org.gtk.gio.ListModel list);

        @ApiStatus.Internal default int upcall(MemoryAddress list) {
            var RESULT = run((org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(list)), org.gtk.gio.ListModel.fromAddress).marshal(list, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNItemsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_n_items}
     * @param getNItems The new value of the field {@code get_n_items}
     */
    public void setGetNItems(GetNItemsCallback getNItems) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_n_items"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNItems == null ? MemoryAddress.NULL : getNItems.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetItemCallback {
        @Nullable org.gtk.gobject.GObject run(org.gtk.gio.ListModel list, int position);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress list, int position) {
            var RESULT = run((org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(list)), org.gtk.gio.ListModel.fromAddress).marshal(list, Ownership.NONE), position);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetItemCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_item}
     * @param getItem The new value of the field {@code get_item}
     */
    public void setGetItem(GetItemCallback getItem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_item"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItem == null ? MemoryAddress.NULL : getItem.toCallback()));
    }
    
    /**
     * Create a ListModelInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ListModelInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ListModelInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ListModelInterface(input, ownership);
    
    /**
     * A {@link ListModelInterface.Builder} object constructs a {@link ListModelInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ListModelInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ListModelInterface struct;
        
        private Builder() {
            struct = ListModelInterface.allocate();
        }
        
         /**
         * Finish building the {@link ListModelInterface} struct.
         * @return A new instance of {@code ListModelInterface} with the fields 
         *         that were set in the Builder object.
         */
        public ListModelInterface build() {
            return struct;
        }
        
        /**
         * parent {@link org.gtk.gobject.TypeInterface}
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setGetItemType(GetItemTypeCallback getItemType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItemType == null ? MemoryAddress.NULL : getItemType.toCallback()));
            return this;
        }
        
        public Builder setGetNItems(GetNItemsCallback getNItems) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_items"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNItems == null ? MemoryAddress.NULL : getNItems.toCallback()));
            return this;
        }
        
        public Builder setGetItem(GetItemCallback getItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItem == null ? MemoryAddress.NULL : getItem.toCallback()));
            return this;
        }
    }
}
