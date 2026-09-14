# Lumière Quickstart

A clean robot project for [Lumière](https://github.com/Dillylol/Lumiere), built from the official
[FIRST Tech Challenge Robot Controller SDK v12.0](https://github.com/FIRST-Tech-Challenge/FtcRobotController/releases/tag/v12.0).

TeamCode starts blank. Create your robot programs in Lumière or Android Studio; no sample OpModes,
tuning procedures, generated robot code, credentials, or Lumière transport source are copied into
this repository.

## Included libraries

Gradle downloads libraries from their official Maven repositories. Feature switches live at the
bottom of `gradle.properties`:

| Switch | Default | Adds |
| --- | --- | --- |
| `lumiere.pedro` | `true` | Pedro Pathing 3.0.0 and Ivy 1.1.1 |
| `lumiere.autotune` | `false` | Pedro AutoTune 1.0.0 |
| `lumiere.panels` | `false` | Panels 1.0.12 |
| `lumiere.simulator` | `true` | Lumière desktop simulation support for tests |

The small Lumière robot runtime is installed as
`com.github.Dillylol.Lumiere:ftc-lib:v0.1.2`. Generated projects call its public API; the
implementation is not duplicated into TeamCode.

## Start

1. Clone or download this repository.
2. Open the folder in Lumière and create a program, or open it in Android Studio.
3. Keep Pedro enabled for Lumière-generated autonomous and TeleOp programs.
4. Enable AutoTune or Panels only when your team needs them.
5. Build and deploy through Lumière or run `TeamCode > Tasks > build > assembleDebug` in Android Studio.

The first build downloads the selected dependencies. The app and Android Studio use the same Gradle
project, and no Lumière account or cloud service is required.

## Safety

- The project never stores robot Wi-Fi passwords, personal tokens, or private release-signing keys. The standard FTC debug keystore remains unchanged from the official SDK.
- Lumière can build and install an APK, but OpModes still start from the FTC Driver Station.
- Test new mechanisms at low power with the robot raised safely before placing it on the field.
- Only enable libraries you use, and commit `gradle.properties` so every team member builds the same setup.

The untouched FTC SDK readme is available at [doc/FTC_SDK_README.md](doc/FTC_SDK_README.md).

## Documentation

- [Lumière](https://github.com/Dillylol/Lumiere)
- [FTC documentation](https://ftc-docs.firstinspires.org)
- [Pedro Pathing](https://pedropathing.com/docs/pathing)
- [Panels](https://panels.bylazar.com)
