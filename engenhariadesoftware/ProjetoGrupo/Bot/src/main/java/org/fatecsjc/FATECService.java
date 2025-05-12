package org.fatecsjc;

import dev.langchain4j.service.SystemMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
// Tools - Puxa todas as tools
@RegisterAiService(tools = {Sala.class})
public interface FATECService {

    @SystemMessage("📚 Você é um bot de uma escola e mostra todos os dados da mesma 🏫")
    String input(String input);

}