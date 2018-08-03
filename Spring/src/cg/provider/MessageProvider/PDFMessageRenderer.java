package cg.provider.MessageProvider;

import com.cg.provider.MessageProvider;

public class PDFMessageRenderer implements MessageRenderer {
	private MessageProvider provider;

	public void render() {
		System.out.println(provider.getMessage() + "On PDF :-D");
	}

	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}

}
