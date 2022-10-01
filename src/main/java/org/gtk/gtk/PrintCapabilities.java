package org.gtk.gtk;

/**
 * Specifies which features the print dialog should offer.
 * <p>
 * If neither {@link PrintCapabilities#GENERATE_PDF} nor
 * {@link PrintCapabilities#GENERATE_PS} is specified, GTK assumes that all
 * formats are supported.
 */
public class PrintCapabilities extends io.github.jwharm.javagi.Bitfield {

    /**
     * Print dialog will offer printing even/odd pages.
     */
    public static final PrintCapabilities PAGE_SET = new PrintCapabilities(1);
    
    /**
     * Print dialog will allow to print multiple copies.
     */
    public static final PrintCapabilities COPIES = new PrintCapabilities(2);
    
    /**
     * Print dialog will allow to collate multiple copies.
     */
    public static final PrintCapabilities COLLATE = new PrintCapabilities(4);
    
    /**
     * Print dialog will allow to print pages in reverse order.
     */
    public static final PrintCapabilities REVERSE = new PrintCapabilities(8);
    
    /**
     * Print dialog will allow to scale the output.
     */
    public static final PrintCapabilities SCALE = new PrintCapabilities(16);
    
    /**
     * The program will send the document to
     *   the printer in PDF format
     */
    public static final PrintCapabilities GENERATE_PDF = new PrintCapabilities(32);
    
    /**
     * The program will send the document to
     *   the printer in Postscript format
     */
    public static final PrintCapabilities GENERATE_PS = new PrintCapabilities(64);
    
    /**
     * Print dialog will offer a preview
     */
    public static final PrintCapabilities PREVIEW = new PrintCapabilities(128);
    
    /**
     * Print dialog will offer printing multiple
     *   pages per sheet
     */
    public static final PrintCapabilities NUMBER_UP = new PrintCapabilities(256);
    
    /**
     * Print dialog will allow to rearrange
     *   pages when printing multiple pages per sheet
     */
    public static final PrintCapabilities NUMBER_UP_LAYOUT = new PrintCapabilities(512);
    
    public PrintCapabilities(int value) {
        super(value);
    }
    
}
