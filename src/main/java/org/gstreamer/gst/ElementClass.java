package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer element class. Override the vmethods to implement the element
 * functionality.
 */
public class ElementClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstElementClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("metadata"),
        Interop.valueLayout.ADDRESS.withName("elementfactory"),
        Interop.valueLayout.ADDRESS.withName("padtemplates"),
        Interop.valueLayout.C_INT.withName("numpadtemplates"),
        Interop.valueLayout.C_INT.withName("pad_templ_cookie"),
        Interop.valueLayout.ADDRESS.withName("pad_added"),
        Interop.valueLayout.ADDRESS.withName("pad_removed"),
        Interop.valueLayout.ADDRESS.withName("no_more_pads"),
        Interop.valueLayout.ADDRESS.withName("request_new_pad"),
        Interop.valueLayout.ADDRESS.withName("release_pad"),
        Interop.valueLayout.ADDRESS.withName("get_state"),
        Interop.valueLayout.ADDRESS.withName("set_state"),
        Interop.valueLayout.ADDRESS.withName("change_state"),
        Interop.valueLayout.ADDRESS.withName("state_changed"),
        Interop.valueLayout.ADDRESS.withName("set_bus"),
        Interop.valueLayout.ADDRESS.withName("provide_clock"),
        Interop.valueLayout.ADDRESS.withName("set_clock"),
        Interop.valueLayout.ADDRESS.withName("send_event"),
        Interop.valueLayout.ADDRESS.withName("query"),
        Interop.valueLayout.ADDRESS.withName("post_message"),
        Interop.valueLayout.ADDRESS.withName("set_context"),
        MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link ElementClass}
     * @return A new, uninitialized @{link ElementClass}
     */
    public static ElementClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ElementClass newInstance = new ElementClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code metadata}
     * @return The value of the field {@code metadata}
     */
    public java.lang.foreign.MemoryAddress metadata$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code metadata}
     * @param metadata The new value of the field {@code metadata}
     */
    public void metadata$set(java.lang.foreign.MemoryAddress metadata) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) metadata);
    }
    
    /**
     * Get the value of the field {@code elementfactory}
     * @return The value of the field {@code elementfactory}
     */
    public org.gstreamer.gst.ElementFactory elementfactory$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("elementfactory"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ElementFactory(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code elementfactory}
     * @param elementfactory The new value of the field {@code elementfactory}
     */
    public void elementfactory$set(org.gstreamer.gst.ElementFactory elementfactory) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("elementfactory"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), elementfactory.handle());
    }
    
    /**
     * Get the value of the field {@code padtemplates}
     * @return The value of the field {@code padtemplates}
     */
    public org.gtk.glib.List padtemplates$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padtemplates"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code padtemplates}
     * @param padtemplates The new value of the field {@code padtemplates}
     */
    public void padtemplates$set(org.gtk.glib.List padtemplates) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padtemplates"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), padtemplates.handle());
    }
    
    /**
     * Get the value of the field {@code numpadtemplates}
     * @return The value of the field {@code numpadtemplates}
     */
    public int numpadtemplates$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("numpadtemplates"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code numpadtemplates}
     * @param numpadtemplates The new value of the field {@code numpadtemplates}
     */
    public void numpadtemplates$set(int numpadtemplates) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("numpadtemplates"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), numpadtemplates);
    }
    
    /**
     * Get the value of the field {@code pad_templ_cookie}
     * @return The value of the field {@code pad_templ_cookie}
     */
    public int padTemplCookie$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pad_templ_cookie"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pad_templ_cookie}
     * @param padTemplCookie The new value of the field {@code pad_templ_cookie}
     */
    public void padTemplCookie$set(int padTemplCookie) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pad_templ_cookie"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), padTemplCookie);
    }
    
    /**
     * Create a ElementClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ElementClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Set {@code key} with {@code value} as metadata in {@code klass}.
     * @param key the key to set
     * @param value the value to set
     */
    public void addMetadata(@NotNull java.lang.String key, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_element_class_add_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a padtemplate to an element class. This is mainly used in the _class_init
     * functions of classes. If a pad template with the same name as an already
     * existing one is added the old one is replaced by the new one.
     * <p>
     * {@code templ}'s reference count will be incremented, and any floating
     * reference will be removed (see gst_object_ref_sink())
     * @param templ a {@link PadTemplate} to add to the element class.
     */
    public void addPadTemplate(@NotNull org.gstreamer.gst.PadTemplate templ) {
        java.util.Objects.requireNonNull(templ, "Parameter 'templ' must not be null");
        try {
            DowncallHandles.gst_element_class_add_pad_template.invokeExact(
                    handle(),
                    templ.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code key} with {@code value} as metadata in {@code klass}.
     * <p>
     * Same as gst_element_class_add_metadata(), but {@code value} must be a static string
     * or an inlined string, as it will not be copied. (GStreamer plugins will
     * be made resident once loaded, so this function can be used even from
     * dynamically loaded plugins.)
     * @param key the key to set
     * @param value the value to set
     */
    public void addStaticMetadata(@NotNull java.lang.String key, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_element_class_add_static_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a pad template to an element class based on the static pad template
     * {@code templ}. This is mainly used in the _class_init functions of element
     * implementations. If a pad template with the same name already exists,
     * the old one is replaced by the new one.
     * @param staticTempl {@link StaticPadTemplate} to add as pad template to the element class.
     */
    public void addStaticPadTemplate(@NotNull org.gstreamer.gst.StaticPadTemplate staticTempl) {
        java.util.Objects.requireNonNull(staticTempl, "Parameter 'staticTempl' must not be null");
        try {
            DowncallHandles.gst_element_class_add_static_pad_template.invokeExact(
                    handle(),
                    staticTempl.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a pad template to an element class based on the static pad template
     * {@code templ}. This is mainly used in the _class_init functions of element
     * implementations. If a pad template with the same name already exists,
     * the old one is replaced by the new one.
     * @param staticTempl {@link StaticPadTemplate} to add as pad template to the element class.
     * @param padType The {@link org.gtk.gobject.Type} of the pad to create
     */
    public void addStaticPadTemplateWithGtype(@NotNull org.gstreamer.gst.StaticPadTemplate staticTempl, @NotNull org.gtk.glib.Type padType) {
        java.util.Objects.requireNonNull(staticTempl, "Parameter 'staticTempl' must not be null");
        java.util.Objects.requireNonNull(padType, "Parameter 'padType' must not be null");
        try {
            DowncallHandles.gst_element_class_add_static_pad_template_with_gtype.invokeExact(
                    handle(),
                    staticTempl.handle(),
                    padType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get metadata with {@code key} in {@code klass}.
     * @param key the key to get
     * @return the metadata for {@code key}.
     */
    public @NotNull java.lang.String getMetadata(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_class_get_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves a padtemplate from {@code element_class} with the given name.
     * <blockquote>
     *  If you use this function in the {@link org.gtk.gobject.InstanceInitFunc} of an object class
     *  that has subclasses, make sure to pass the g_class parameter of the
     *  {@link org.gtk.gobject.InstanceInitFunc} here.
     * </blockquote>
     * @param name the name of the {@link PadTemplate} to get.
     * @return the {@link PadTemplate} with the
     *     given name, or {@code null} if none was found. No unreferencing is
     *     necessary.
     */
    public @Nullable org.gstreamer.gst.PadTemplate getPadTemplate(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_class_get_pad_template.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.PadTemplate(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a list of the pad templates associated with {@code element_class}. The
     * list must not be modified by the calling code.
     * <blockquote>
     *  If you use this function in the {@link org.gtk.gobject.InstanceInitFunc} of an object class
     *  that has subclasses, make sure to pass the g_class parameter of the
     *  {@link org.gtk.gobject.InstanceInitFunc} here.
     * </blockquote>
     * @return the {@link org.gtk.glib.List} of
     *     pad templates.
     */
    public @NotNull org.gtk.glib.List getPadTemplateList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_element_class_get_pad_template_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the detailed information for a {@link ElementClass}.
     * <blockquote>
     *  This function is for use in _class_init functions only.
     * </blockquote>
     * @param longname The long English name of the element. E.g. "File Sink"
     * @param classification String describing the type of element, as an unordered list
     * separated with slashes ('/'). See draft-klass.txt of the design docs
     * for more details and common types. E.g: "Sink/File"
     * @param description Sentence describing the purpose of the element.
     * E.g: "Write stream to a file"
     * @param author Name and contact details of the author(s). Use \\n to separate
     * multiple author metadata. E.g: "Joe Bloggs &amp;lt;joe.blogs at foo.com&amp;gt;"
     */
    public void setMetadata(@NotNull java.lang.String longname, @NotNull java.lang.String classification, @NotNull java.lang.String description, @NotNull java.lang.String author) {
        java.util.Objects.requireNonNull(longname, "Parameter 'longname' must not be null");
        java.util.Objects.requireNonNull(classification, "Parameter 'classification' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        java.util.Objects.requireNonNull(author, "Parameter 'author' must not be null");
        try {
            DowncallHandles.gst_element_class_set_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(longname),
                    Interop.allocateNativeString(classification),
                    Interop.allocateNativeString(description),
                    Interop.allocateNativeString(author));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the detailed information for a {@link ElementClass}.
     * <p>
     * <blockquote>
     *  This function is for use in _class_init functions only.
     * </blockquote><p>
     * Same as gst_element_class_set_metadata(), but {@code longname}, {@code classification},
     * {@code description}, and {@code author} must be static strings or inlined strings, as
     * they will not be copied. (GStreamer plugins will be made resident once
     * loaded, so this function can be used even from dynamically loaded plugins.)
     * @param longname The long English name of the element. E.g. "File Sink"
     * @param classification String describing the type of element, as an unordered list
     * separated with slashes ('/'). See draft-klass.txt of the design docs
     * for more details and common types. E.g: "Sink/File"
     * @param description Sentence describing the purpose of the element.
     * E.g: "Write stream to a file"
     * @param author Name and contact details of the author(s). Use \\n to separate
     * multiple author metadata. E.g: "Joe Bloggs &amp;lt;joe.blogs at foo.com&amp;gt;"
     */
    public void setStaticMetadata(@NotNull java.lang.String longname, @NotNull java.lang.String classification, @NotNull java.lang.String description, @NotNull java.lang.String author) {
        java.util.Objects.requireNonNull(longname, "Parameter 'longname' must not be null");
        java.util.Objects.requireNonNull(classification, "Parameter 'classification' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        java.util.Objects.requireNonNull(author, "Parameter 'author' must not be null");
        try {
            DowncallHandles.gst_element_class_set_static_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(longname),
                    Interop.allocateNativeString(classification),
                    Interop.allocateNativeString(description),
                    Interop.allocateNativeString(author));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_element_class_add_metadata = Interop.downcallHandle(
            "gst_element_class_add_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_add_pad_template = Interop.downcallHandle(
            "gst_element_class_add_pad_template",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_add_static_metadata = Interop.downcallHandle(
            "gst_element_class_add_static_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_add_static_pad_template = Interop.downcallHandle(
            "gst_element_class_add_static_pad_template",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_add_static_pad_template_with_gtype = Interop.downcallHandle(
            "gst_element_class_add_static_pad_template_with_gtype",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_element_class_get_metadata = Interop.downcallHandle(
            "gst_element_class_get_metadata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_get_pad_template = Interop.downcallHandle(
            "gst_element_class_get_pad_template",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_get_pad_template_list = Interop.downcallHandle(
            "gst_element_class_get_pad_template_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_set_metadata = Interop.downcallHandle(
            "gst_element_class_set_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_element_class_set_static_metadata = Interop.downcallHandle(
            "gst_element_class_set_static_metadata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ElementClass struct;
        
         /**
         * A {@link ElementClass.Build} object constructs a {@link ElementClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ElementClass.allocate();
        }
        
         /**
         * Finish building the {@link ElementClass} struct.
         * @return A new instance of {@code ElementClass} with the fields 
         *         that were set in the Build object.
         */
        public ElementClass construct() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * metadata for elements of this class
         * @param metadata The value for the {@code metadata} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMetadata(java.lang.foreign.MemoryAddress metadata) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("metadata"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (metadata == null ? MemoryAddress.NULL : (Addressable) metadata));
            return this;
        }
        
        /**
         * the {@link ElementFactory} that creates these elements
         * @param elementfactory The value for the {@code elementfactory} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setElementfactory(org.gstreamer.gst.ElementFactory elementfactory) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("elementfactory"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementfactory == null ? MemoryAddress.NULL : elementfactory.handle()));
            return this;
        }
        
        /**
         * a {@link org.gtk.glib.List} of {@link PadTemplate}
         * @param padtemplates The value for the {@code padtemplates} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPadtemplates(org.gtk.glib.List padtemplates) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padtemplates"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padtemplates == null ? MemoryAddress.NULL : padtemplates.handle()));
            return this;
        }
        
        /**
         * the number of padtemplates
         * @param numpadtemplates The value for the {@code numpadtemplates} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNumpadtemplates(int numpadtemplates) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("numpadtemplates"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), numpadtemplates);
            return this;
        }
        
        /**
         * changed whenever the padtemplates change
         * @param padTemplCookie The value for the {@code padTemplCookie} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPadTemplCookie(int padTemplCookie) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad_templ_cookie"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), padTemplCookie);
            return this;
        }
        
        public Build setPadAdded(java.lang.foreign.MemoryAddress padAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padAdded == null ? MemoryAddress.NULL : padAdded));
            return this;
        }
        
        public Build setPadRemoved(java.lang.foreign.MemoryAddress padRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padRemoved == null ? MemoryAddress.NULL : padRemoved));
            return this;
        }
        
        public Build setNoMorePads(java.lang.foreign.MemoryAddress noMorePads) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("no_more_pads"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (noMorePads == null ? MemoryAddress.NULL : noMorePads));
            return this;
        }
        
        public Build setRequestNewPad(java.lang.foreign.MemoryAddress requestNewPad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_new_pad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestNewPad == null ? MemoryAddress.NULL : requestNewPad));
            return this;
        }
        
        public Build setReleasePad(java.lang.foreign.MemoryAddress releasePad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_pad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releasePad == null ? MemoryAddress.NULL : releasePad));
            return this;
        }
        
        public Build setGetState(java.lang.foreign.MemoryAddress getState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getState == null ? MemoryAddress.NULL : getState));
            return this;
        }
        
        public Build setSetState(java.lang.foreign.MemoryAddress setState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setState == null ? MemoryAddress.NULL : setState));
            return this;
        }
        
        public Build setChangeState(java.lang.foreign.MemoryAddress changeState) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeState == null ? MemoryAddress.NULL : changeState));
            return this;
        }
        
        public Build setStateChanged(java.lang.foreign.MemoryAddress stateChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stateChanged == null ? MemoryAddress.NULL : stateChanged));
            return this;
        }
        
        public Build setSetBus(java.lang.foreign.MemoryAddress setBus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_bus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setBus == null ? MemoryAddress.NULL : setBus));
            return this;
        }
        
        public Build setProvideClock(java.lang.foreign.MemoryAddress provideClock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("provide_clock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (provideClock == null ? MemoryAddress.NULL : provideClock));
            return this;
        }
        
        public Build setSetClock(java.lang.foreign.MemoryAddress setClock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_clock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setClock == null ? MemoryAddress.NULL : setClock));
            return this;
        }
        
        public Build setSendEvent(java.lang.foreign.MemoryAddress sendEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendEvent == null ? MemoryAddress.NULL : sendEvent));
            return this;
        }
        
        public Build setQuery(java.lang.foreign.MemoryAddress query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query));
            return this;
        }
        
        public Build setPostMessage(java.lang.foreign.MemoryAddress postMessage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("post_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (postMessage == null ? MemoryAddress.NULL : postMessage));
            return this;
        }
        
        public Build setSetContext(java.lang.foreign.MemoryAddress setContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setContext == null ? MemoryAddress.NULL : setContext));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
