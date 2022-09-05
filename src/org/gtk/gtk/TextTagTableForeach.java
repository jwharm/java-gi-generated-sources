package org.gtk.gtk;

@FunctionalInterface
public interface TextTagTableForeach {

    /**
     * A function used with gtk_text_tag_table_foreach(),
     * to iterate over every `GtkTextTag` inside a `GtkTextTagTable`.
     */
    public void onTextTagTableForeach(TextTag tag, jdk.incubator.foreign.MemoryAddress data);
}
