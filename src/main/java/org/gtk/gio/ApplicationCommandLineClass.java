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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ApplicationCommandLineClass newInstance = new ApplicationCommandLineClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code PrintLiteralCallback} callback.
     */
    @FunctionalInterface
    public interface PrintLiteralCallback {
    
        void run(org.gtk.gio.ApplicationCommandLine cmdline, java.lang.String message);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cmdline, MemoryAddress message) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ApplicationCommandLine) Interop.register(cmdline, org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(cmdline, null), Marshal.addressToString.marshal(message, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrintLiteralCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code print_literal}
     * @param printLiteral The new value of the field {@code print_literal}
     */
    public void setPrintLiteral(PrintLiteralCallback printLiteral) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("print_literal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (printLiteral == null ? MemoryAddress.NULL : printLiteral.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrinterrLiteralCallback} callback.
     */
    @FunctionalInterface
    public interface PrinterrLiteralCallback {
    
        void run(org.gtk.gio.ApplicationCommandLine cmdline, java.lang.String message);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cmdline, MemoryAddress message) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.ApplicationCommandLine) Interop.register(cmdline, org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(cmdline, null), Marshal.addressToString.marshal(message, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrinterrLiteralCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code printerr_literal}
     * @param printerrLiteral The new value of the field {@code printerr_literal}
     */
    public void setPrinterrLiteral(PrinterrLiteralCallback printerrLiteral) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("printerr_literal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (printerrLiteral == null ? MemoryAddress.NULL : printerrLiteral.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetStdinCallback} callback.
     */
    @FunctionalInterface
    public interface GetStdinCallback {
    
        @Nullable org.gtk.gio.InputStream run(org.gtk.gio.ApplicationCommandLine cmdline);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress cmdline) {
            var RESULT = run((org.gtk.gio.ApplicationCommandLine) Interop.register(cmdline, org.gtk.gio.ApplicationCommandLine.fromAddress).marshal(cmdline, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetStdinCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_stdin}
     * @param getStdin The new value of the field {@code get_stdin}
     */
    public void setGetStdin(GetStdinCallback getStdin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_stdin"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getStdin == null ? MemoryAddress.NULL : getStdin.toCallback()));
        }
    }
    
    /**
     * Create a ApplicationCommandLineClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ApplicationCommandLineClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ApplicationCommandLineClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ApplicationCommandLineClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setPrintLiteral(PrintLiteralCallback printLiteral) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("print_literal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (printLiteral == null ? MemoryAddress.NULL : printLiteral.toCallback()));
                return this;
            }
        }
        
        public Builder setPrinterrLiteral(PrinterrLiteralCallback printerrLiteral) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("printerr_literal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (printerrLiteral == null ? MemoryAddress.NULL : printerrLiteral.toCallback()));
                return this;
            }
        }
        
        public Builder setGetStdin(GetStdinCallback getStdin) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_stdin"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getStdin == null ? MemoryAddress.NULL : getStdin.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
