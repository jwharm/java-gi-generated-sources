package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MenuModelClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuModelClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("is_mutable"),
            Interop.valueLayout.ADDRESS.withName("get_n_items"),
            Interop.valueLayout.ADDRESS.withName("get_item_attributes"),
            Interop.valueLayout.ADDRESS.withName("iterate_item_attributes"),
            Interop.valueLayout.ADDRESS.withName("get_item_attribute_value"),
            Interop.valueLayout.ADDRESS.withName("get_item_links"),
            Interop.valueLayout.ADDRESS.withName("iterate_item_links"),
            Interop.valueLayout.ADDRESS.withName("get_item_link")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MenuModelClass}
     * @return A new, uninitialized @{link MenuModelClass}
     */
    public static MenuModelClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MenuModelClass newInstance = new MenuModelClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsMutableCallback} callback.
     */
    @FunctionalInterface
    public interface IsMutableCallback {
    
        boolean run(org.gtk.gio.MenuModel model);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model) {
            var RESULT = run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsMutableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_mutable}
     * @param isMutable The new value of the field {@code is_mutable}
     */
    public void setIsMutable(IsMutableCallback isMutable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_mutable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isMutable == null ? MemoryAddress.NULL : isMutable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNItemsCallback} callback.
     */
    @FunctionalInterface
    public interface GetNItemsCallback {
    
        int run(org.gtk.gio.MenuModel model);
        
        @ApiStatus.Internal default int upcall(MemoryAddress model) {
            var RESULT = run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNItemsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_n_items}
     * @param getNItems The new value of the field {@code get_n_items}
     */
    public void setGetNItems(GetNItemsCallback getNItems) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_items"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNItems == null ? MemoryAddress.NULL : getNItems.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetItemAttributesCallback} callback.
     */
    @FunctionalInterface
    public interface GetItemAttributesCallback {
    
        void run(org.gtk.gio.MenuModel model, int itemIndex, Out<org.gtk.glib.HashTable> attributes);
        
        @ApiStatus.Internal default void upcall(MemoryAddress model, int itemIndex, MemoryAddress attributes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gtk.glib.HashTable> attributesOUT = new Out<>(org.gtk.glib.HashTable.fromAddress.marshal(attributes, null));
                run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null), itemIndex, attributesOUT);
                attributes.set(Interop.valueLayout.ADDRESS, 0, attributesOUT.get().handle());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetItemAttributesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_item_attributes}
     * @param getItemAttributes The new value of the field {@code get_item_attributes}
     */
    public void setGetItemAttributes(GetItemAttributesCallback getItemAttributes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemAttributes == null ? MemoryAddress.NULL : getItemAttributes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterateItemAttributesCallback} callback.
     */
    @FunctionalInterface
    public interface IterateItemAttributesCallback {
    
        org.gtk.gio.MenuAttributeIter run(org.gtk.gio.MenuModel model, int itemIndex);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress model, int itemIndex) {
            var RESULT = run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null), itemIndex);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterateItemAttributesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iterate_item_attributes}
     * @param iterateItemAttributes The new value of the field {@code iterate_item_attributes}
     */
    public void setIterateItemAttributes(IterateItemAttributesCallback iterateItemAttributes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterateItemAttributes == null ? MemoryAddress.NULL : iterateItemAttributes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetItemAttributeValueCallback} callback.
     */
    @FunctionalInterface
    public interface GetItemAttributeValueCallback {
    
        @Nullable org.gtk.glib.Variant run(org.gtk.gio.MenuModel model, int itemIndex, java.lang.String attribute, @Nullable org.gtk.glib.VariantType expectedType);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress model, int itemIndex, MemoryAddress attribute, MemoryAddress expectedType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null), itemIndex, Marshal.addressToString.marshal(attribute, null), org.gtk.glib.VariantType.fromAddress.marshal(expectedType, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetItemAttributeValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_item_attribute_value}
     * @param getItemAttributeValue The new value of the field {@code get_item_attribute_value}
     */
    public void setGetItemAttributeValue(GetItemAttributeValueCallback getItemAttributeValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_attribute_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemAttributeValue == null ? MemoryAddress.NULL : getItemAttributeValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetItemLinksCallback} callback.
     */
    @FunctionalInterface
    public interface GetItemLinksCallback {
    
        void run(org.gtk.gio.MenuModel model, int itemIndex, Out<org.gtk.glib.HashTable> links);
        
        @ApiStatus.Internal default void upcall(MemoryAddress model, int itemIndex, MemoryAddress links) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gtk.glib.HashTable> linksOUT = new Out<>(org.gtk.glib.HashTable.fromAddress.marshal(links, null));
                run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null), itemIndex, linksOUT);
                links.set(Interop.valueLayout.ADDRESS, 0, linksOUT.get().handle());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetItemLinksCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_item_links}
     * @param getItemLinks The new value of the field {@code get_item_links}
     */
    public void setGetItemLinks(GetItemLinksCallback getItemLinks) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_links"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemLinks == null ? MemoryAddress.NULL : getItemLinks.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IterateItemLinksCallback} callback.
     */
    @FunctionalInterface
    public interface IterateItemLinksCallback {
    
        org.gtk.gio.MenuLinkIter run(org.gtk.gio.MenuModel model, int itemIndex);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress model, int itemIndex) {
            var RESULT = run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null), itemIndex);
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IterateItemLinksCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code iterate_item_links}
     * @param iterateItemLinks The new value of the field {@code iterate_item_links}
     */
    public void setIterateItemLinks(IterateItemLinksCallback iterateItemLinks) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_links"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterateItemLinks == null ? MemoryAddress.NULL : iterateItemLinks.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetItemLinkCallback} callback.
     */
    @FunctionalInterface
    public interface GetItemLinkCallback {
    
        @Nullable org.gtk.gio.MenuModel run(org.gtk.gio.MenuModel model, int itemIndex, java.lang.String link);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress model, int itemIndex, MemoryAddress link) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.MenuModel) Interop.register(model, org.gtk.gio.MenuModel.fromAddress).marshal(model, null), itemIndex, Marshal.addressToString.marshal(link, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetItemLinkCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_item_link}
     * @param getItemLink The new value of the field {@code get_item_link}
     */
    public void setGetItemLink(GetItemLinkCallback getItemLink) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_link"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemLink == null ? MemoryAddress.NULL : getItemLink.toCallback()));
        }
    }
    
    /**
     * Create a MenuModelClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MenuModelClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MenuModelClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MenuModelClass(input);
    
    /**
     * A {@link MenuModelClass.Builder} object constructs a {@link MenuModelClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MenuModelClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MenuModelClass struct;
        
        private Builder() {
            struct = MenuModelClass.allocate();
        }
        
        /**
         * Finish building the {@link MenuModelClass} struct.
         * @return A new instance of {@code MenuModelClass} with the fields 
         *         that were set in the Builder object.
         */
        public MenuModelClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setIsMutable(IsMutableCallback isMutable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_mutable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isMutable == null ? MemoryAddress.NULL : isMutable.toCallback()));
                return this;
            }
        }
        
        public Builder setGetNItems(GetNItemsCallback getNItems) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_n_items"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNItems == null ? MemoryAddress.NULL : getNItems.toCallback()));
                return this;
            }
        }
        
        public Builder setGetItemAttributes(GetItemAttributesCallback getItemAttributes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_item_attributes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemAttributes == null ? MemoryAddress.NULL : getItemAttributes.toCallback()));
                return this;
            }
        }
        
        public Builder setIterateItemAttributes(IterateItemAttributesCallback iterateItemAttributes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_attributes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterateItemAttributes == null ? MemoryAddress.NULL : iterateItemAttributes.toCallback()));
                return this;
            }
        }
        
        public Builder setGetItemAttributeValue(GetItemAttributeValueCallback getItemAttributeValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_item_attribute_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemAttributeValue == null ? MemoryAddress.NULL : getItemAttributeValue.toCallback()));
                return this;
            }
        }
        
        public Builder setGetItemLinks(GetItemLinksCallback getItemLinks) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_item_links"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemLinks == null ? MemoryAddress.NULL : getItemLinks.toCallback()));
                return this;
            }
        }
        
        public Builder setIterateItemLinks(IterateItemLinksCallback iterateItemLinks) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_links"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iterateItemLinks == null ? MemoryAddress.NULL : iterateItemLinks.toCallback()));
                return this;
            }
        }
        
        public Builder setGetItemLink(GetItemLinkCallback getItemLink) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_item_link"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getItemLink == null ? MemoryAddress.NULL : getItemLink.toCallback()));
                return this;
            }
        }
    }
}
