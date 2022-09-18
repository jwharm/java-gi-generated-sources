package org.gtk.gtk;

/**
 * Specifies which features the print dialog should offer.
 * 
 * If neither {@link org.gtk.gtk.PrintCapabilities<code>#GENERATE_PDF</code>  nor
 * {@link org.gtk.gtk.PrintCapabilities<code>#GENERATE_PS</code>  is specified, GTK assumes that all
 * formats are supported.
 */
public class PrintCapabilities {

    /**
     * Print dialog will offer printing even/odd pages.
     */
    public static final int PAGE_SET = 1;
    
    /**
     * Print dialog will allow to print multiple copies.
     */
    public static final int COPIES = 2;
    
    /**
     * Print dialog will allow to collate multiple copies.
     */
    public static final int COLLATE = 4;
    
    /**
     * Print dialog will allow to print pages in reverse order.
     */
    public static final int REVERSE = 8;
    
    /**
     * Print dialog will allow to scale the output.
     */
    public static final int SCALE = 16;
    
    /**
     * The program will send the document to
     *   the printer in PDF format
     */
    public static final int GENERATE_PDF = 32;
    
    /**
     * The program will send the document to
     *   the printer in Postscript format
     */
    public static final int GENERATE_PS = 64;
    
    /**
     * Print dialog will offer a preview
     */
    public static final int PREVIEW = 128;
    
    /**
     * Print dialog will offer printing multiple
     *   pages per sheet
     */
    public static final int NUMBER_UP = 256;
    
    /**
     * Print dialog will allow to rearrange
     *   pages when printing multiple pages per sheet
     */
    public static final int NUMBER_UP_LAYOUT = 512;
    
}
