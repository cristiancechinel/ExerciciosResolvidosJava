
public class Ponto {
	protected float x;
	protected float y;

	void setPonto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	float getX() {
		return this.x;
	}

	float getY() {
		return this.y;
	}

	Ponto() {
	}

	Ponto(float x, float y) {
		setPonto(x, y);
	}

	void move(float dx, float dy) {
		x += dx;
		y += dy;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + " : x = " + this.x + " y = " + this.y;
	}
}
