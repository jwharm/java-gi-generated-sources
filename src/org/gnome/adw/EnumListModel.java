package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code Gio.ListModel} representing values of a given enum.
 * <p>
 * {@code AdwEnumListModel} contains objects of type {@link EnumListItem}.
 */
public class EnumListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public EnumListModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EnumListModel */
    public static EnumListModel castFrom(org.gtk.gobject.Object gobject) {
        return new EnumListModel(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gobject.Type enumType) {
        Reference RESULT = References.get(gtk_h.adw_enum_list_model_new(enumType.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwEnumListModel} for {@code enum_type}.
     */
    public EnumListModel(org.gtk.gobject.Type enumType) {
        super(constructNew(enumType));
    }
    
    /**
     * Finds the position of a given enum value in {@code self}.
     */
    public int findPosition(int value) {
        var RESULT = gtk_h.adw_enum_list_model_find_position(handle(), value);
        return RESULT;
    }
    
    /**
     * Gets the type of the enum represented by {@code self}.
     */
    public org.gtk.gobject.Type getEnumType() {
        var RESULT = gtk_h.adw_enum_list_model_get_enum_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
}
