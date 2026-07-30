# opta-data-schemae

Serialization schemas for [Opta](https://en.wikipedia.org/wiki/Opta_Sports) sports data objects (player info, player fixture stats), drawing on real-time Opta XML integration work from Flip Sports. Intended as a reusable data layer for sports-data pipeline demos.

## Modules

- **`play-json`** - Play-JSON reads/writes for `OptaPlayerInfo` and `OptaPlayerFixtureStats`, plus command/event types (`UpdateOptaPlayerInfo`, `OptaPlayerInfoUpdated`, etc.) for an event-sourced style of updating them.
- **`spray-json`** - equivalent Spray-JSON codecs for `OptaPlayerInfo`.
- **`avro`** - an Avro schema (`OptaPlayerInfo.avsc`) for the same data, for use with Kafka/schema-registry-based pipelines.

## Building

```bash
sbt compile
```
