package kr.co.himedia.builder02;

public class NyPizza extends Pizza {
	
	public NyPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
	}

	public enum Size { SAMLL, MEDIUM, LARGE };
	private final Size size;

	public static class Builder extends Pizza.Builder {
		private final Size size;
		
		public Builder(Size size) {
			this.size = size;
		}

		@Override
		protected Builder self() {
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		Pizza build() {
			// TODO Auto-generated method stub
			return new NyPizza(this);
		}
		
	}

}
