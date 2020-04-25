package br.com.usjt.DiadaSemana;

public enum DiaSemana {
	
	
	DOMINGO {
		@Override
		public Dia obterMensagem() {
			// TODO Auto-generated method stub
			return new Domingo();
		}
	},
		SEGUNDA {
			@Override
			public Dia obterMensagem() {
				// TODO Auto-generated method stub
				return new SegundaFeira();
			}

	
	},TERCA {
		@Override
		public Dia obterMensagem() {
			// TODO Auto-generated method stub
			return new TerçaFeira();
		}
	},QUARTA {
		@Override
		public Dia obterMensagem() {
			// TODO Auto-generated method stub
			return new QuartaFeira();
		}
	},QUINTA {
		@Override
		public Dia obterMensagem() {
			// TODO Auto-generated method stub
			return new QuintaFeira();
		}
	},SEXTA {
		@Override
		public Dia obterMensagem() {
			// TODO Auto-generated method stub
			return new SextaFeira();
		}
	},SABADO {
		@Override
		public Dia obterMensagem() {
			// TODO Auto-generated method stub
			return new Sabado();
		}
	};
		
	
	
	public abstract Dia obterMensagem();

}
