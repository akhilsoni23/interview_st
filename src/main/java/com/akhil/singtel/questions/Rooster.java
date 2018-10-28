package com.akhil.singtel.questions;

final public class Rooster extends Chicken {

	public Rooster() {
		super("Cock-a-doodle-doo");
	}

	public Rooster(LangEnum language) {
		super(language.getVoice());
	}

	static enum LangEnum

	{
		Danish("Danish", " kykyliky"), Dutch("Dutch", "kukeleku"), Finnish("Finnish", "kukko kiekuu"), French("French",
				"cocorico"), German("German", "kikeri"),;
		private String voice;

		LangEnum(String language, String voice) {
			this.voice = voice;
		}

		public String getVoice() {
			return this.voice;
		}

	}
}
