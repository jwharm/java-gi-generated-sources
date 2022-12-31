package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link ApplicationCommandLineClass}-struct
 * contains private data only.
 * @version 2.28
 */
public class ApplicationCommandLineClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationCommandLineClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("print_literal"),
            Interop.valueLayout.ADDRESS.withName("printerr_literal"),
            Interop.valueLayout.ADDRESS.withName("get_stdin"),
            MemoryLayout.sequenceLayout(11, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ApplicationCommandLineClass}
     * @return A new, uninitialized @{link ApplicationCommandLineClass}
     */
    public static ApplicationCommandLineClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ApplicationCommandLineClass newInstance = new ApplicationCommandLineClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface PrintLiteralCallback {
        void run(org.gtk.gio.ApplicationCommandLine cmdline, java.lang.String message);

        @ApiStatus.Internal default void upcall(MemoryAddress cmdline, MemoryAddress message) {
            run((org.gtk.gio.ApplicationCommandLine) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cmdline)), org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(cmdline, Ownership.NONE), Marshal.addressToString.marshal(message, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrintLiteralCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code print_literal}
     * @param printLiteral The new value of the field {@code print_literal}
     */
    public void setPrintLiteral(PrintLiteralCallback printLiteral) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("print_literal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (printLiteral == null ? MemoryAddress.NULL : printLiteral.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrinterrLiteralCallback {
        void run(org.gtk.gio.ApplicationCommandLine cmdline, java.lang.String message);

        @ApiStatus.Internal default void upcall(MemoryAddress cmdline, MemoryAddress message) {
            run((org.gtk.gio.ApplicationCommandLine) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cmdline)), org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(cmdline, Ownership.NONE), Marshal.addressToString.marshal(message, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrinterrLiteralCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code printerr_literal}
     * @param printerrLiteral The new value of the field {@code printerr_literal}
     */
    public void setPrinterrLiteral(PrinterrLiteralCallback printerrLiteral) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("printerr_literal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (printerrLiteral == null ? MemoryAddress.NULL : printerrLiteral.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetStdinCallback {
        @Nullable org.gtk.gio.InputStream run(org.gtk.gio.ApplicationCommandLine cmdline);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress cmdline) {
            var RESULT = run((org.gtk.gio.ApplicationCommandLine) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cmdline)), org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(cmdline, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetStdinCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_stdin}
     * @param getStdin The new value of the field {@code get_stdin}
     */
    public void setGetStdin(GetStdinCallback getStdin) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_stdin"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStdin == null ? MemoryAddress.NULL : getStdin.toCallback()));
    }
    
    /**
     * Create a ApplicationCommandLineClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ApplicationCommandLineClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationCommandLineClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationCommandLineClass(input, ownership);
    
    /**
     * A {@link ApplicationCommandLineClass.Builder} object constructs a {@link ApplicationCommandLineClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ApplicationCommandLineClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ApplicationCommandLineClass struct;
        
        private Builder() {
            struct = ApplicationCommandLineClass.allocate();
        }
        
         /**
         * Finish building the {@link ApplicationCommandLineClass} struct.
         * @return A new instance of {@code ApplicationCommandLineClass} with the fields 
         *         that were set in the Builder object.
         */
        public ApplicationCommandLineClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setPrintLiteral(PrintLiteralCallback printLiteral) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("print_literal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (printLiteral == null ? MemoryAddress.NULL : printLiteral.toCallback()));
            return this;
        }
        
        public Builder setPrinterrLiteral(PrinterrLiteralCallback printerrLiteral) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("printerr_literal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (printerrLiteral == null ? MemoryAddress.NULL : printerrLiteral.toCallback()));
            return this;
        }
        
        public Builder setGetStdin(GetStdinCallback getStdin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_stdin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStdin == null ? MemoryAddress.NULL : getStdin.toCallback()));
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
