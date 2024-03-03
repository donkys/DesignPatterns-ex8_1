public class ImageManager {
    private Renderer renderer;

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void show() {
        if (renderer != null) {
            renderer.showImage();
        }
    }
}
