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
public class PadTemplate extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPadTemplate";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.ADDRESS.withName("name_template"),
        Interop.valueLayout.C_INT.withName("direction"),
        Interop.valueLayout.C_INT.withName("presence"),
        Interop.valueLayout.ADDRESS.withName("caps")
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
     * Create a PadTemplate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PadTemplate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PadTemplate if its GType is a (or inherits from) "GstPadTemplate".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PadTemplate} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPadTemplate", a ClassCastException will be thrown.
     */
    public static PadTemplate castFrom(org.gtk.gobject.Object gobject) {
            return new PadTemplate(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull java.lang.String nameTemplate, @NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.PadPresence presence, @NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(nameTemplate, "Parameter 'nameTemplate' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(presence, "Parameter 'presence' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_new.invokeExact(
                    Interop.allocateNativeString(nameTemplate),
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
    public PadTemplate(@NotNull java.lang.String nameTemplate, @NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.PadPresence presence, @NotNull org.gstreamer.gst.Caps caps) {
        super(constructNew(nameTemplate, direction, presence, caps), Ownership.NONE);
    }
    
    private static Addressable constructNewFromStaticPadTemplateWithGtype(@NotNull org.gstreamer.gst.StaticPadTemplate padTemplate, @NotNull org.gtk.glib.Type padType) {
        java.util.Objects.requireNonNull(padTemplate, "Parameter 'padTemplate' must not be null");
        java.util.Objects.requireNonNull(padType, "Parameter 'padType' must not be null");
        Addressable RESULT;
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
     * @param padType The {@link org.gtk.gobject.Type} of the pad to create
     * @return a new {@link PadTemplate}.
     */
    public static PadTemplate newFromStaticPadTemplateWithGtype(@NotNull org.gstreamer.gst.StaticPadTemplate padTemplate, @NotNull org.gtk.glib.Type padType) {
        return new PadTemplate(constructNewFromStaticPadTemplateWithGtype(padTemplate, padType), Ownership.NONE);
    }
    
    private static Addressable constructNewWithGtype(@NotNull java.lang.String nameTemplate, @NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.PadPresence presence, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gtk.glib.Type padType) {
        java.util.Objects.requireNonNull(nameTemplate, "Parameter 'nameTemplate' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(presence, "Parameter 'presence' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(padType, "Parameter 'padType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_new_with_gtype.invokeExact(
                    Interop.allocateNativeString(nameTemplate),
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
     * @param padType The {@link org.gtk.gobject.Type} of the pad to create
     * @return a new {@link PadTemplate}.
     */
    public static PadTemplate newWithGtype(@NotNull java.lang.String nameTemplate, @NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.PadPresence presence, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gtk.glib.Type padType) {
        return new PadTemplate(constructNewWithGtype(nameTemplate, direction, presence, caps, padType), Ownership.NONE);
    }
    
    /**
     * Gets the capabilities of the pad template.
     * @return the {@link Caps} of the pad template.
     * Unref after usage.
     */
    public @NotNull org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * See gst_pad_template_set_documentation_caps().
     * @return The caps to document. For convenience, this will return
     *   gst_pad_template_get_caps() when no documentation caps were set.
     */
    public @NotNull org.gstreamer.gst.Caps getDocumentationCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_template_get_documentation_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Emit the pad-created signal for this template when created by this pad.
     * @param pad the {@link Pad} that created it
     */
    public void padCreated(@NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
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
    public void setDocumentationCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(PadTemplate source, @NotNull org.gstreamer.gst.Pad pad);
    }
    
    /**
     * This signal is fired when an element creates a pad from this template.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PadTemplate.PadCreated> onPadCreated(PadTemplate.PadCreated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pad-created"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PadTemplate.Callbacks.class, "signalPadTemplatePadCreated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PadTemplate.PadCreated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link PadTemplate.Build} object constructs a {@link PadTemplate} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PadTemplate} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PadTemplate} using {@link PadTemplate#castFrom}.
         * @return A new instance of {@code PadTemplate} with the properties 
         *         that were set in the Build object.
         */
        public PadTemplate construct() {
            return PadTemplate.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PadTemplate.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The capabilities of the pad described by the pad template.
         * @param caps The value for the {@code caps} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        /**
         * The direction of the pad described by the pad template.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDirection(org.gstreamer.gst.PadDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The type of the pad described by the pad template.
         * @param gtype The value for the {@code gtype} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtype(org.gtk.glib.Type gtype) {
            names.add("gtype");
            values.add(org.gtk.gobject.Value.create(gtype));
            return this;
        }
        
        /**
         * The name template of the pad template.
         * @param nameTemplate The value for the {@code name-template} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNameTemplate(java.lang.String nameTemplate) {
            names.add("name-template");
            values.add(org.gtk.gobject.Value.create(nameTemplate));
            return this;
        }
        
        /**
         * When the pad described by the pad template will become available.
         * @param presence The value for the {@code presence} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPresence(org.gstreamer.gst.PadPresence presence) {
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
    
    private static class Callbacks {
        
        public static void signalPadTemplatePadCreated(MemoryAddress source, MemoryAddress pad, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PadTemplate.PadCreated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PadTemplate(source, Ownership.NONE), new org.gstreamer.gst.Pad(pad, Ownership.NONE));
        }
    }
}
