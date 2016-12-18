netlogo-mas-drones
==================

A 3D NetLogo 5 multi-agents system simulating a civil UAV drones mission, where they have to escort and protect a humanitarian convoy transporting a critical cargo.

![drones-global](https://raw.githubusercontent.com/lrq3000/netlogo-mas-drones/master/img/drones-global.jpg)

This simulation can also be played in first person mode, like a game:

![drones-fpsmode](https://raw.githubusercontent.com/lrq3000/netlogo-mas-drones/master/img/drones-fpsmode.png)

The flying UAV drones are totally autonomous, they can follow the convoy, look ahead of it, explore surroundings and detect potential threats and communicate their positions to the convoy to trace a new safer route. They are communicating wirelessly in a decentralized fashion by using three different techniques to ensure the reliability of communication and that their information is totally up-to-date with the latest findings from any of the other drones.

You can see a color code for the drones depending on the communication status: blue when connected (directly or indirectly through other drones) to the head of the convoy (which constantly sends wireless beacons to the drones nearbies) ; orange when not connected to the convoy anymore (their info may get out of date until they meet the convoy or another drone that is connected to the convoy) ; red when dead (out of fuel). The yellow circle around the drones show the range of their wireless communication (aka: the "communication ring" which is in fact a 3D sphere).

The simulation procedurally generates a random 3D terrain with various obstacles (mountains, rivers) to ensure that the drones are resilient and adaptive to new environments. The convoy simulates a human behavior by using a A* planification algorithm to plan its path to reach the target point.

The environment is really in 3D, so that enemies cannot reach drones that are too high, which drones can use to their advantage to recognize and shoot enemies without being destroyed themselves. However, the drawback of being high in altitude is that drones have a harder time reaching the convoy, and so they can get lost more easily.

This simulation mix ups different technologies in order to achieve autonomous flying drones: BDI agency to maintain and update local knowledge databases, peer-to-peer communication via a watered-down Agent-Speak like protocol, negociation strategies to assign exploration and defence strategies equitably, auto-management of supplies threshold to know when to go back to the base, and the Connectivity-Preserving Scattering (CPS) algorithm to overcome the limited connectivity and the scattering problem (see Maria Gradinariu Potop-Butucaru, Taisuke Izumi, and Sébastien Tixeuil. Connectivity-preserving scattering of mobile robots with limited visibility. In Stabilization, Safety, and Security of Distributed Systems, pages 319–331. Springer, 2010).

You can find a full report (in french) of the algorithms used and the rationale behind in the folder "report".

This simulation was done by Stephen Larroque, Olivier Hotel and Issam Bani as part of a university project at the University Pierre-and-Marie-Curie (Paris VI) in artificial intelligence, multi-agent systems.

The source code can be downloaded here:
https://github.com/lrq3000/netlogo-mas-drones

A presentation explaining the techniques used can be found here:
http://fr.slideshare.net/lrq3000/sma-presentationbanihotellarroque

And a video demonstration can be found here:
https://www.youtube.com/watch?v=ifWwJb-GWbQ

## Authors

Stephen Larroque and Olivier Hotel for a Master project at University Pierre-and-Marie-Curie Paris 6.

## License

Opensource license under MIT.
