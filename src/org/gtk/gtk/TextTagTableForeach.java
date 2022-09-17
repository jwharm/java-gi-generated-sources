package org.gtk.gtk;

/**
 * A function used with gtk_text_tag_table_foreach(),
 * to iterate over every <code>GtkTextTag</code> inside a <code>GtkTextTagTable</code>.
 */
@FunctionalInterface
public interface TextTagTableForeach {
        void onTextTagTableForeach(TextTag tag);
}
