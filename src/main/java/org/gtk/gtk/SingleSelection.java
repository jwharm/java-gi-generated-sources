package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSingleSelection} is a {@code GtkSelectionModel} that allows selecting a single
 * item.
 * <p>
 * Note that the selection is <em>persistent</em> -- if the selected item is removed
 * and re-added in the same {@code Gio.ListModel::items-changed} emission, it
 * stays selected. In particular, this means that changing the sort order of an
 * underlying sort model will preserve the selection.
 */
public class SingleSelection extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel, org.gtk.gtk.SelectionModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSingleSelection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SingleSelection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SingleSelection(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SingleSelection> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SingleSelection(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gio.ListModel model) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_single_selection_new.invokeExact((Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     * @param model the {@code GListModel} to manage
     */
    public SingleSelection(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model));
        this.takeOwnership();
    }
    
    /**
     * Checks if autoselect has been enabled or disabled via
     * gtk_single_selection_set_autoselect().
     * @return {@code true} if autoselect is enabled
     */
    public boolean getAutoselect() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_single_selection_get_autoselect.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * If {@code true}, gtk_selection_model_unselect_item() is supported and allows
     * unselecting the selected item.
     * @return {@code true} to support unselecting
     */
    public boolean getCanUnselect() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_single_selection_get_can_unselect.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the model that {@code self} is wrapping.
     * @return The model being wrapped
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_single_selection_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the position of the selected item.
     * <p>
     * If no item is selected, {@code GTK_INVALID_LIST_POSITION} is returned.
     * @return The position of the selected item
     */
    public int getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_single_selection_get_selected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the selected item.
     * <p>
     * If no item is selected, {@code null} is returned.
     * @return The selected item
     */
    public @Nullable org.gtk.gobject.GObject getSelectedItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_single_selection_get_selected_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Enables or disables autoselect.
     * <p>
     * If {@code autoselect} is {@code true}, {@code self} will enforce that an item is always
     * selected. It will select a new item when the currently selected
     * item is deleted and it will disallow unselecting the current item.
     * @param autoselect {@code true} to always select an item
     */
    public void setAutoselect(boolean autoselect) {
        try {
            DowncallHandles.gtk_single_selection_set_autoselect.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(autoselect, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code true}, unselecting the current item via
     * gtk_selection_model_unselect_item() is supported.
     * <p>
     * Note that setting {@code Gtk.SingleSelection:autoselect} will
     * cause unselecting to not work, so it practically makes no sense
     * to set both at the same time the same time.
     * @param canUnselect {@code true} to allow unselecting
     */
    public void setCanUnselect(boolean canUnselect) {
        try {
            DowncallHandles.gtk_single_selection_set_can_unselect.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(canUnselect, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, {@code self} will be empty.
     * @param model A {@code GListModel} to wrap
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_single_selection_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects the item at the given position.
     * <p>
     * If the list does not have an item at {@code position} or
     * {@code GTK_INVALID_LIST_POSITION} is given, the behavior depends on the
     * value of the {@code Gtk.SingleSelection:autoselect} property:
     * If it is set, no change will occur and the old item will stay
     * selected. If it is unset, the selection will be unset and no item
     * will be selected.
     * @param position the item to select or {@code GTK_INVALID_LIST_POSITION}
     */
    public void setSelected(int position) {
        try {
            DowncallHandles.gtk_single_selection_set_selected.invokeExact(
                    handle(),
                    position);
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
            RESULT = (long) DowncallHandles.gtk_single_selection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SingleSelection.Builder} object constructs a {@link SingleSelection} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SingleSelection.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SingleSelection} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SingleSelection}.
         * @return A new instance of {@code SingleSelection} with the properties 
         *         that were set in the Builder object.
         */
        public SingleSelection build() {
            return (SingleSelection) org.gtk.gobject.GObject.newWithProperties(
                SingleSelection.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If the selection will always select an item.
         * @param autoselect The value for the {@code autoselect} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAutoselect(boolean autoselect) {
            names.add("autoselect");
            values.add(org.gtk.gobject.Value.create(autoselect));
            return this;
        }
        
        /**
         * If unselecting the selected item is allowed.
         * @param canUnselect The value for the {@code can-unselect} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanUnselect(boolean canUnselect) {
            names.add("can-unselect");
            values.add(org.gtk.gobject.Value.create(canUnselect));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The model being managed.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
        
        /**
         * Position of the selected item.
         * @param selected The value for the {@code selected} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelected(int selected) {
            names.add("selected");
            values.add(org.gtk.gobject.Value.create(selected));
            return this;
        }
        
        /**
         * The selected item.
         * @param selectedItem The value for the {@code selected-item} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelectedItem(org.gtk.gobject.GObject selectedItem) {
            names.add("selected-item");
            values.add(org.gtk.gobject.Value.create(selectedItem));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_single_selection_new = Interop.downcallHandle(
                "gtk_single_selection_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_single_selection_get_autoselect = Interop.downcallHandle(
                "gtk_single_selection_get_autoselect",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_single_selection_get_can_unselect = Interop.downcallHandle(
                "gtk_single_selection_get_can_unselect",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_single_selection_get_model = Interop.downcallHandle(
                "gtk_single_selection_get_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_single_selection_get_selected = Interop.downcallHandle(
                "gtk_single_selection_get_selected",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_single_selection_get_selected_item = Interop.downcallHandle(
                "gtk_single_selection_get_selected_item",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_single_selection_set_autoselect = Interop.downcallHandle(
                "gtk_single_selection_set_autoselect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_single_selection_set_can_unselect = Interop.downcallHandle(
                "gtk_single_selection_set_can_unselect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_single_selection_set_model = Interop.downcallHandle(
                "gtk_single_selection_set_model",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_single_selection_set_selected = Interop.downcallHandle(
                "gtk_single_selection_set_selected",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_single_selection_get_type = Interop.downcallHandle(
                "gtk_single_selection_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_single_selection_get_type != null;
    }
}
