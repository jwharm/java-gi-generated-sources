package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code AdwEnumListItem} is the type of items in a {@link EnumListModel}.
 */
public class EnumListItem extends org.gtk.gobject.Object {

    public EnumListItem(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EnumListItem */
    public static EnumListItem castFrom(org.gtk.gobject.Object gobject) {
        return new EnumListItem(gobject.getReference());
    }
    
    /**
     * Gets the enum value name.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.adw_enum_list_item_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the enum value nick.
     */
    public java.lang.String getNick() {
        var RESULT = gtk_h.adw_enum_list_item_get_nick(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the enum value.
     */
    public int getValue() {
        var RESULT = gtk_h.adw_enum_list_item_get_value(handle());
        return RESULT;
    }
    
}
