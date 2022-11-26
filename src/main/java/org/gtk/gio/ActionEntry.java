package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This struct defines a single action.  It is for use with
 * g_action_map_add_action_entries().
 * <p>
 * The order of the items in the structure are intended to reflect
 * frequency of use.  It is permissible to use an incomplete initialiser
 * in order to leave some of the later values as {@code null}.  All values
 * after {@code name} are optional.  Additional optional fields may be added in
 * the future.
 * <p>
 * See g_action_map_add_action_entries() for an example.
 */
public class ActionEntry extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GActionEntry";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("parameter_type"),
        Interop.valueLayout.ADDRESS.withName("state"),
        Interop.valueLayout.ADDRESS.withName("change_state"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.C_LONG).withName("padding")
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
     * Allocate a new {@link ActionEntry}
     * @return A new, uninitialized @{link ActionEntry}
     */
    public static ActionEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ActionEntry newInstance = new ActionEntry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code parameter_type}
     * @return The value of the field {@code parameter_type}
     */
    public java.lang.String parameter_type$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code parameter_type}
     * @param parameter_type The new value of the field {@code parameter_type}
     */
    public void parameter_type$set(java.lang.String parameter_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(parameter_type));
    }
    
    /**
     * Get the value of the field {@code state}
     * @return The value of the field {@code state}
     */
    public java.lang.String state$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("state"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code state}
     * @param state The new value of the field {@code state}
     */
    public void state$set(java.lang.String state) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("state"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(state));
    }
    
    /**
     * Create a ActionEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ActionEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ActionEntry struct;
        
         /**
         * A {@link ActionEntry.Build} object constructs a {@link ActionEntry} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ActionEntry.allocate();
        }
        
         /**
         * Finish building the {@link ActionEntry} struct.
         * @return A new instance of {@code ActionEntry} with the fields 
         *         that were set in the Build object.
         */
        public ActionEntry construct() {
            return struct;
        }
        
        /**
         * the name of the action
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        public Build setActivate(java.lang.foreign.MemoryAddress activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate));
            return this;
        }
        
        /**
         * the type of the parameter that must be passed to the
         *                  activate function for this action, given as a single
         *                  GVariant type string (or {@code null} for no parameter)
         * @param parameter_type The value for the {@code parameter_type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParameterType(java.lang.String parameter_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parameter_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parameter_type == null ? MemoryAddress.NULL : Interop.allocateNativeString(parameter_type)));
            return this;
        }
        
        /**
         * the initial state for this action, given in
         *         [GVariant text format][gvariant-text].  The state is parsed
         *         with no extra type information, so type tags must be added to
         *         the string if they are necessary.  Stateless actions should
         *         give {@code null} here.
         * @param state The value for the {@code state} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setState(java.lang.String state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (state == null ? MemoryAddress.NULL : Interop.allocateNativeString(state)));
            return this;
        }
        
        public Build setChangeState(java.lang.foreign.MemoryAddress change_state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (change_state == null ? MemoryAddress.NULL : change_state));
            return this;
        }
        
        public Build setPadding(long[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
