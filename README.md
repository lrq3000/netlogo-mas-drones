netlogo-mas-drones
==================

A NetLogo 5 multi-agents system simulating a civil UAV drones mission, where they have to escort and protect a humanitarian convoy transporting a critical cargo.

The flying UAV drones are totally autonomous, they can follow the convoy, look ahead of it, explore surroundings and detect potential threats and communicate their positions to the convoy to trace a new safer route. They are communicating wirelessly in a decentralized fashion by using three different techniques to ensure the reliability of communication and that their information is totally up-to-date with the latest findings from any of the other drones.

The simulation procedurally generates a random 3D terrain with various obstacles (mountains, rivers) to ensure that the drones are resilient and adaptive to new environments. The convoy simulates a human behavior by using a A* planification algorithm to plan its path to reach the target point.

This simulation was done by Stephen Larroque, Olivier Hotel and Issam Bani as part of a university project at the University Pierre-and-Marie-Curie (Paris VI) in artificial intelligence, multi-agent systems.

The source code can be downloaded here:
https://github.com/lrq3000/netlogo-mas-drones

A presentation explaining the techniques used can be found here:
http://fr.slideshare.net/lrq3000/sma-presentationbanihotellarroque

And a video demonstration can be found here:
https://www.youtube.com/watch?v=ifWwJb-GWbQ&feature=youtu.be
