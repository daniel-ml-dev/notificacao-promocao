# Sistema de Notificações de Promoção

Projeto do curso de Design Patterns com Java. Simula o envio de notificações de promoções por e-mail, SMS e push.

## Padrões utilizados
- **Strategy**: `NotificacaoStrategy` com as implementações `NotificacaoEmail`, `NotificacaoSMS` e `NotificacaoPush`.
- **Singleton**: `GerenciadorNotificacoes` garante uma única instância.
- **Facade**: `CanalNotificacaoFacade` oferece métodos simples para o cliente.

## Como executar
```bash
javac -d out src/CanalNotificacaoFacade.java src/GerenciadorNotificacoes.java src/Main.java src/NotificacaoEmail.java src/NotificacaoPush.java src/NotificacaoSMS.java src/NotificacaoStrategy.java src/Promocao.java
java -cp out Main
```
