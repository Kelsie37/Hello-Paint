import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.print.*;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class HelloPaint {
    public static void main(String[] args) {
        Graphics g = new Graphics2D() {
            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public void translate(final int x, final int y) {

            }

            @Override
            public void translate(final double tx, final double ty) {

            }

            @Override
            public void rotate(final double theta) {

            }

            @Override
            public void rotate(final double theta, final double x, final double y) {

            }

            @Override
            public void scale(final double sx, final double sy) {

            }

            @Override
            public void shear(final double shx, final double shy) {

            }

            @Override
            public void transform(final AffineTransform Tx) {

            }

            @Override
            public void setTransform(final AffineTransform Tx) {

            }

            @Override
            public AffineTransform getTransform() {
                return null;
            }

            @Override
            public Paint getPaint() {
                return null;
            }

            @Override
            public Composite getComposite() {
                return null;
            }

            @Override
            public void setBackground(final Color color) {

            }

            @Override
            public Color getBackground() {
                return null;
            }

            @Override
            public Stroke getStroke() {
                return null;
            }

            @Override
            public void clip(final Shape s) {

            }

            @Override
            public FontRenderContext getFontRenderContext() {
                return null;
            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(final Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(final Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(final Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(final Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(final int x, final int y, final int width, final int height) {

            }

            @Override
            public void setClip(final int x, final int y, final int width, final int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(final Shape clip) {

            }

            @Override
            public void copyArea(final int x, final int y, final int width, final int height, final int dx, final int dy) {

            }

            @Override
            public void drawLine(final int x1, final int y1, final int x2, final int y2) {

            }

            @Override
            public void fillRect(final int x, final int y, final int width, final int height) {

            }

            @Override
            public void clearRect(final int x, final int y, final int width, final int height) {

            }

            @Override
            public void drawRoundRect(final int x, final int y, final int width, final int height, final int arcWidth, final int arcHeight) {

            }

            @Override
            public void fillRoundRect(final int x, final int y, final int width, final int height, final int arcWidth, final int arcHeight) {

            }

            @Override
            public void drawOval(final int x, final int y, final int width, final int height) {

            }

            @Override
            public void fillOval(final int x, final int y, final int width, final int height) {

            }

            @Override
            public void drawArc(final int x, final int y, final int width, final int height, final int startAngle, final int arcAngle) {

            }

            @Override
            public void fillArc(final int x, final int y, final int width, final int height, final int startAngle, final int arcAngle) {

            }

            @Override
            public void drawPolyline(final int[] xPoints, final int[] yPoints, final int nPoints) {

            }

            @Override
            public void drawPolygon(final int[] xPoints, final int[] yPoints, final int nPoints) {

            }

            @Override
            public void fillPolygon(final int[] xPoints, final int[] yPoints, final int nPoints) {

            }

            @Override
            public void draw(final Shape s) {

            }

            @Override
            public boolean drawImage(final Image img, final AffineTransform xform, final ImageObserver obs) {
                return false;
            }

            @Override
            public void drawImage(final BufferedImage img, final BufferedImageOp op, final int x, final int y) {

            }

            @Override
            public void drawRenderedImage(final RenderedImage img, final AffineTransform xform) {

            }

            @Override
            public void drawRenderableImage(final RenderableImage img, final AffineTransform xform) {

            }

            @Override
            public void drawString(final String str, final int x, final int y) {

            }

            @Override
            public void drawString(final String str, final float x, final float y) {

            }

            @Override
            public void drawString(final AttributedCharacterIterator iterator, final int x, final int y) {

            }

            @Override
            public void drawString(final AttributedCharacterIterator iterator, final float x, final float y) {

            }

            @Override
            public void drawGlyphVector(final GlyphVector g, final float x, final float y) {

            }

            @Override
            public void fill(final Shape s) {

            }

            @Override
            public boolean hit(final Rectangle rect, final Shape s, final boolean onStroke) {
                return false;
            }

            @Override
            public GraphicsConfiguration getDeviceConfiguration() {
                return null;
            }

            @Override
            public void setComposite(final Composite comp) {

            }

            @Override
            public void setPaint(final Paint paint) {

            }

            @Override
            public void setStroke(final Stroke s) {

            }

            @Override
            public void setRenderingHint(final RenderingHints.Key hintKey, final Object hintValue) {

            }

            @Override
            public Object getRenderingHint(final RenderingHints.Key hintKey) {
                return null;
            }

            @Override
            public void setRenderingHints(final Map<?, ?> hints) {

            }

            @Override
            public void addRenderingHints(final Map<?, ?> hints) {

            }

            @Override
            public RenderingHints getRenderingHints() {
                return null;
            }

            @Override
            public boolean drawImage(final Image img, final int x, final int y, final ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(final Image img, final int x, final int y, final int width, final int height, final ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(final Image img, final int x, final int y, final Color bgcolor, final ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(final Image img, final int x, final int y, final int width, final int height, final Color bgcolor, final ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(final Image img, final int dx1, final int dy1, final int dx2, final int dy2, final int sx1, final int sy1, final int sx2, final int sy2, final ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(final Image img, final int dx1, final int dy1, final int dx2, final int dy2, final int sx1, final int sy1, final int sx2, final int sy2, final Color bgcolor, final ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };

        JFrame frame = new JFrame("Hello Paint");
        JLabel label = new JLabel("Hello Paint");
        label.setFont(new Font("Helvetica-Bold", Font.BOLD, 20));
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
//        Graphics2D g2d = (Graphics2D) g;
//        String titleText = "Hello Paint";
//        Font titleFont = new Font("helvetica", Font.BOLD, 36);
//        g2d.setFont(titleFont);
//        g2d.drawString("Hello Paint", 100, 50);
//
//        frame.print(g2d);
//        g.setColor(Color.BLACK);
//        g2d.dispose();
//        frame.paintAll(g2d);

//        System.out.println("Hello, Paint");
//        System.exit(0);

//        int w = old.getWidth();
//        int h = old.getHeight();
//        BufferedImage img = new BufferedImage(
//                w, h, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = img.createGraphics();
//        g2d.drawImage(old, 0, 0, null);
//        g2d.setPaint(Color.red);
//        g2d.setFont(new Font("Serif", Font.BOLD, 20));
//        String s = "Hello, world!";
//        FontMetrics fm = g2d.getFontMetrics();
//        int x = img.getWidth() - fm.stringWidth(s) - 5;
//        int y = fm.getHeight();
//        g2d.drawString(s, x, y);
//        g2d.dispose();
//        return img;
//        JFrame f = new JFrame();
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.add(new TextOverlay());
//        f.pack();
//        f.setVisible(true);
    }
}
