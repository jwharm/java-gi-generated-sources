package org.gtk.gtk;

@FunctionalInterface
public interface PageSetupDoneFunc {

    /**
     * The type of function that is passed to
     * gtk_print_run_page_setup_dialog_async().
     * 
     * This function will be called when the page setup dialog
     * is dismissed, and also serves as destroy notify for @data.
     */
    public void onPageSetupDoneFunc(PageSetup pageSetup, jdk.incubator.foreign.MemoryAddress data);
}
