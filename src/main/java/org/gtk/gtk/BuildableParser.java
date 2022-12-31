package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A sub-parser for {@code GtkBuildable} implementations.
 */
public class BuildableParser extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuildableParser";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("start_element"),
            Interop.valueLayout.ADDRESS.withName("end_element"),
            Interop.valueLayout.ADDRESS.withName("text"),
            Interop.valueLayout.ADDRESS.withName("error"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BuildableParser}
     * @return A new, uninitialized @{link BuildableParser}
     */
    public static BuildableParser allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BuildableParser newInstance = new BuildableParser(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface StartElementCallback {
        void run(org.gtk.gtk.BuildableParseContext context, java.lang.String elementName, PointerString attributeNames, PointerString attributeValues);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress elementName, MemoryAddress attributeNames, MemoryAddress attributeValues, MemoryAddress userData) {
            run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, Ownership.NONE), Marshal.addressToString.marshal(elementName, null), new PointerString(attributeNames), new PointerString(attributeValues));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartElementCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_element}
     * @param startElement The new value of the field {@code start_element}
     */
    public void setStartElement(StartElementCallback startElement) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_element"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startElement == null ? MemoryAddress.NULL : startElement.toCallback()));
    }
    
    @FunctionalInterface
    public interface EndElementCallback {
        void run(org.gtk.gtk.BuildableParseContext context, java.lang.String elementName);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress elementName, MemoryAddress userData) {
            run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, Ownership.NONE), Marshal.addressToString.marshal(elementName, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EndElementCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_element}
     * @param endElement The new value of the field {@code end_element}
     */
    public void setEndElement(EndElementCallback endElement) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_element"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endElement == null ? MemoryAddress.NULL : endElement.toCallback()));
    }
    
    @FunctionalInterface
    public interface TextCallback {
        void run(org.gtk.gtk.BuildableParseContext context, java.lang.String text, long textLen);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress text, long textLen, MemoryAddress userData) {
            run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, Ownership.NONE), Marshal.addressToString.marshal(text, null), textLen);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code text}
     * @param text The new value of the field {@code text}
     */
    public void setText(TextCallback text) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("text"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : text.toCallback()));
    }
    
    @FunctionalInterface
    public interface ErrorCallback {
        void run(org.gtk.gtk.BuildableParseContext context, org.gtk.glib.Error error);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress error, MemoryAddress userData) {
            run(org.gtk.gtk.BuildableParseContext.fromAddress.marshal(context, Ownership.NONE), org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ErrorCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code error}
     * @param error The new value of the field {@code error}
     */
    public void setError(ErrorCallback error) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
    }
    
    /**
     * Create a BuildableParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BuildableParser(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuildableParser> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BuildableParser(input, ownership);
    
    /**
     * A {@link BuildableParser.Builder} object constructs a {@link BuildableParser} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BuildableParser.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BuildableParser struct;
        
        private Builder() {
            struct = BuildableParser.allocate();
        }
        
         /**
         * Finish building the {@link BuildableParser} struct.
         * @return A new instance of {@code BuildableParser} with the fields 
         *         that were set in the Builder object.
         */
        public BuildableParser build() {
            return struct;
        }
        
        public Builder setStartElement(StartElementCallback startElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startElement == null ? MemoryAddress.NULL : startElement.toCallback()));
            return this;
        }
        
        public Builder setEndElement(EndElementCallback endElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endElement == null ? MemoryAddress.NULL : endElement.toCallback()));
            return this;
        }
        
        public Builder setText(TextCallback text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : text.toCallback()));
            return this;
        }
        
        public Builder setError(ErrorCallback error) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
