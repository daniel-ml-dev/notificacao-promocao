# Sistema de Notificações de Promoção

Projeto do curso de Design Patterns com Java. Envia notificações de promoções por e-mail, SMS e push.

## Padrões utilizados
- **Strategy**: `NotificacaoStrategy` com as implementações `NotificacaoEmail`, `NotificacaoSMS` e `NotificacaoPush`.
- **Singleton**: `GerenciadorNotificacoes` garante uma única instância.
- **Facade**: `CanalNotificacaoFacade` oferece métodos simples para o cliente.

## Como executar
```bash
javac -d out src/*.java
java -cp out Main
```
