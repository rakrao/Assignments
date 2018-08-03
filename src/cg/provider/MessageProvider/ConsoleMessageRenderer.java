package cg.provider.MessageProvider;

import com.cg.provider.MessageProvider;

public class ConsoleMessageRenderer implements MessageRenderer{
	private MessageProvider provider;

	public void render() {
		System.out.println(provider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}

}
