# Lumière + Pedro Pathing Quickstart

A ready-to-use FTC robot project that combines [Lumière](https://github.com/Dillylol/Lumiere) with the official [Pedro Pathing Quickstart](https://github.com/Pedro-Pathing/Quickstart).

This project tracks Pedro Quickstart commit [`b431238`](https://github.com/Pedro-Pathing/Quickstart/commit/b4312385b7d0cc5e8dd263ec3927c9ef0cb48f36) and uses FTC SDK 12.0.0. TeamCode contains Pedro's tuning setup and no example autonomous or TeleOp programs, so teams can start their own robot code in Lumière.

## Included

- Pedro Pathing 3.0.0 and its official AutoTune 1.0.0 procedures
- Ivy commands 1.1.1 for Lumière-generated robot programs
- Panels 1.0.12 for robot telemetry and tuning pages
- Lumière's robot runtime and desktop simulator 0.1.2
- FTC SDK 12.0.0 dependencies

Libraries are downloaded by Gradle. The repository does not copy Lumière's data transport implementation into TeamCode or store robot Wi-Fi passwords, personal tokens, or private signing keys.

## Start

1. Clone or download this repository.
2. Open its top-level folder in Lumière.
3. Use the Pedro tuning OpModes in the Driver Station to tune the real robot.
4. Paste the AutoTune result into `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/pedro/Constants.java` through Lumière.
5. Create autonomous and TeleOp programs in Lumière, then build and deploy them.

The default `Constants.java` contains safe placeholder estimates so the project compiles and the simulator can start. Tune the real robot before driving it at normal power.

## App integration

Lumière expects the following pieces, all of which are included here:

- a Pedro `Constants.create(HardwareMap)` factory for generated OpModes
- Pedro and Ivy dependencies for generated paths and commands
- the Lumière robot runtime for live headings and field data
- `RunSimulator` plus the simulator test dependency for the desktop simulator
- the standard FTC Gradle tasks used by Build, Test, and Deploy

Run a full local check with:

```text
gradlew.bat :TeamCode:assembleDebug :TeamCode:testDebugUnitTest
```

On macOS or Linux, use `./gradlew` instead. GitHub Actions runs the same checks after every push.

## Upstream documentation

- [Pedro Pathing documentation](https://pedropathing.com/docs/pathing)
- [Panels documentation](https://panels.bylazar.com)
- [FTC documentation](https://ftc-docs.firstinspires.org)
- [Original Pedro Quickstart readme](doc/PEDRO_QUICKSTART_README.md)
