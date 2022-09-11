package org.gtk.gtk;

/**
 * The type of function that is passed to
 * gtk_print_run_page_setup_dialog_async().
 * 
 * This function will be called when the page setup dialog
 * is dismissed, and also serves as destroy notify for @data.
 */
@FunctionalInterface
public interface PageSetupDoneFunc {
        void onPageSetupDoneFunc(PageSetup pageSetup);
}
