package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Padtemplates describe the possible media types a pad or an elementfactory can
 * handle. This allows for both inspection of handled types before loading the
 * element plugin as well as identifying pads on elements that are not yet
 * created (request or sometimes pads).
 * <p>
 * Pad and PadTemplates have {@link Caps} attached to it to describe the media type
 * they are capable of dealing with. gst_pad_template_get_caps() or
 * GST_PAD_TEMPLATE_CAPS() are used to get the caps of a padtemplate. It's not
 * possible to modify the caps of a padtemplate after creation.
 * <p>
 * PadTemplates have a {@link PadPresence} property which identifies the lifetime
 * of the pad and that can be retrieved with GST_PAD_TEMPLATE_PRESENCE(). Also
 * the direction of the pad can be retrieved from the {@link PadTemplate} with
 * GST_PAD_TEMPLATE_DIRECTION().
 * <p>
 * The GST_PAD_TEMPLATE_NAME_TEMPLATE () is important for GST_PAD_REQUEST pads
 * because it has to be used as the name in the gst_element_request_pad_simple()
 * call to instantiate a pad from this template.
 * <p>
 * Padtemplates can be created with gst_pad_template_new() or with
 * gst_static_pad_template_get (), which creates a {@link PadTemplate} from a
 * {@link StaticPadTemplate} that can be filled with the
 * convenient GST_STATIC_PAD_TEMPLATE() macro.
 * <p>
 * A padtemplate can be used to create a pad (see gst_pad_new_from_template()
 * or gst_pad_new_from_static_template ()) or to add to an element class
 * (see gst_element_class_add_static_pad_template ()).
 * <p>
 * The following code example shows the code to create a pad from a padtemplate.
 * <pre>{@code <!-- language="C" -->
 *   GstStaticPadTemplate my_template =
 *   GST_STATIC_PAD_TEMPLATE (
 *     "sink",          // the name of the pad
 *     GST_PAD_SINK,    // the direction of the pad
 *     GST_PAD_ALWAYS,  // when this pad will be present
 *     GST_STATIC_CAPS (        // the capabilities of the padtemplate
 *       "audio/x-raw, "
 *         "channels = (int) [ 1, 6 ]"
 *     )
 *   );
 *   void
 *   my_method (void)
 *   {
 *     GstPad *pad;
 *     pad = gst_pad_new_from_static_template (&my_template, "sink");
 *     ...
 *   }
 * }</pre>
 * <p>
 * The following example shows you how to add the padtemplate to an
 * element class, this is usually done in the class_init of the class:
 * <pre>{@code <!-- language="C" -->
 *   static void
 *   my_element_class_init (GstMyElementClass *klass)
 *   {
 *     GstElementClass *gstelement_class = GST_ELEMENT_CLASS (klass);
 * 
 *     gst_element_class_add_static_pad_template (gstelement_class, &my_template);
 *   }
 * }</pre>
 */
public class PadTemplate extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPadTemplate";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("name_template"),
            Interop.valueLayout.C_INT.withName("direction"),
            Interop.valueLayout.C_INT.withName("presence"),
            Interop.valueLayout.ADDRESS.withName("caps")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a PadTemplate proxy instance for the provided memory address.
     * <p>
     * Because PadTemplate is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PadTemplate(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, PadTemplate> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PadTemplate(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String nameTemplate, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.PadPresence presence, org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_new.invokeExact(
                    Marshal.stringToAddress.marshal(nameTemplate, null),
                    direction.getValue(),
                    presence.getValue(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pad template with a name according to the given template
     * and with the given arguments.
     * @param nameTemplate the name template.
     * @param direction the {@link PadDirection} of the template.
     * @param presence the {@link PadPresence} of the pad.
     * @param caps a {@link Caps} set for the template.
     */
    public PadTemplate(java.lang.String nameTemplate, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.PadPresence presence, org.gstreamer.gst.Caps caps) {
        super(constructNew(nameTemplate, direction, presence, caps), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFromStaticPadTemplateWithGtype(org.gstreamer.gst.StaticPadTemplate padTemplate, org.gtk.glib.Type padType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_new_from_static_pad_template_with_gtype.invokeExact(
                    padTemplate.handle(),
                    padType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts a {@link StaticPadTemplate} into a {@link PadTemplate} with a type.
     * @param padTemplate the static pad template
     * @param padType The {@link org.gtk.glib.Type} of the pad to create
     * @return a new {@link PadTemplate}.
     */
    public static PadTemplate newFromStaticPadTemplateWithGtype(org.gstreamer.gst.StaticPadTemplate padTemplate, org.gtk.glib.Type padType) {
        var RESULT = constructNewFromStaticPadTemplateWithGtype(padTemplate, padType);
        return (org.gstreamer.gst.PadTemplate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.PadTemplate.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithGtype(java.lang.String nameTemplate, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.PadPresence presence, org.gstreamer.gst.Caps caps, org.gtk.glib.Type padType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_new_with_gtype.invokeExact(
                    Marshal.stringToAddress.marshal(nameTemplate, null),
                    direction.getValue(),
                    presence.getValue(),
                    caps.handle(),
                    padType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pad template with a name according to the given template
     * and with the given arguments.
     * @param nameTemplate the name template.
     * @param direction the {@link PadDirection} of the template.
     * @param presence the {@link PadPresence} of the pad.
     * @param caps a {@link Caps} set for the template.
     * @param padType The {@link org.gtk.glib.Type} of the pad to create
     * @return a new {@link PadTemplate}.
     */
    public static PadTemplate newWithGtype(java.lang.String nameTemplate, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.PadPresence presence, org.gstreamer.gst.Caps caps, org.gtk.glib.Type padType) {
        var RESULT = constructNewWithGtype(nameTemplate, direction, presence, caps, padType);
        return (org.gstreamer.gst.PadTemplate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.PadTemplate.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the capabilities of the pad template.
     * @return the {@link Caps} of the pad template.
     * Unref after usage.
     */
    public org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * See gst_pad_template_set_documentation_caps().
     * @return The caps to document. For convenience, this will return
     *   gst_pad_template_get_caps() when no documentation caps were set.
     */
    public org.gstreamer.gst.Caps getDocumentationCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_get_documentation_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Emit the pad-created signal for this template when created by this pad.
     * @param pad the {@link Pad} that created it
     */
    public void padCreated(org.gstreamer.gst.Pad pad) {
        try {
            DowncallHandles.gst_pad_template_pad_created.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Certain elements will dynamically construct the caps of their
     * pad templates. In order not to let environment-specific information
     * into the documentation, element authors should use this method to
     * expose "stable" caps to the reader.
     * @param caps the documented capabilities
     */
    public void setDocumentationCaps(org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_pad_template_set_documentation_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caps.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_pad_template_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface PadCreated {
        void run(org.gstreamer.gst.Pad pad);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePadTemplate, MemoryAddress pad) {
            run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PadCreated.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal is fired when an element creates a pad from this template.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PadTemplate.PadCreated> onPadCreated(PadTemplate.PadCreated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pad-created"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link PadTemplate.Builder} object constructs a {@link PadTemplate} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PadTemplate.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PadTemplate} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PadTemplate}.
         * @return A new instance of {@code PadTemplate} with the properties 
         *         that were set in the Builder object.
         */
        public PadTemplate build() {
            return (PadTemplate) org.gtk.gobject.GObject.newWithProperties(
                PadTemplate.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The capabilities of the pad described by the pad template.
         * @param caps The value for the {@code caps} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        /**
         * The direction of the pad described by the pad template.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDirection(org.gstreamer.gst.PadDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The type of the pad described by the pad template.
         * @param gtype The value for the {@code gtype} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGtype(org.gtk.glib.Type gtype) {
            names.add("gtype");
            values.add(org.gtk.gobject.Value.create(gtype));
            return this;
        }
        
        /**
         * The name template of the pad template.
         * @param nameTemplate The value for the {@code name-template} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNameTemplate(java.lang.String nameTemplate) {
            names.add("name-template");
            values.add(org.gtk.gobject.Value.create(nameTemplate));
            return this;
        }
        
        /**
         * When the pad described by the pad template will become available.
         * @param presence The value for the {@code presence} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPresence(org.gstreamer.gst.PadPresence presence) {
            names.add("presence");
            values.add(org.gtk.gobject.Value.create(presence));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_pad_template_new = Interop.downcallHandle(
            "gst_pad_template_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_template_new_from_static_pad_template_with_gtype = Interop.downcallHandle(
            "gst_pad_template_new_from_static_pad_template_with_gtype",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_pad_template_new_with_gtype = Interop.downcallHandle(
            "gst_pad_template_new_with_gtype",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_pad_template_get_caps = Interop.downcallHandle(
            "gst_pad_template_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_template_get_documentation_caps = Interop.downcallHandle(
            "gst_pad_template_get_documentation_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_template_pad_created = Interop.downcallHandle(
            "gst_pad_template_pad_created",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_template_set_documentation_caps = Interop.downcallHandle(
            "gst_pad_template_set_documentation_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pad_template_get_type = Interop.downcallHandle(
            "gst_pad_template_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
