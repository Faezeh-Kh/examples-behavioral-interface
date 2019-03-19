# examples-behavioral-interface

Content of this repository:
 - languages
   - arduino: the complete definition of the Arduino DSL.
   - statemachines: the complete definition of the considered subset of UML State Machines in conformance with PSSM.
 - test
   - arduino: contains a test suite for an Arduino model, as well as a simple launch configuration for that model.
   - statemachines: contains the subset of the PSSM test suite adapted to our UML State Machines implementation subset.

How to execute the models:
  - procure the latest version of the GEMOC Studio (available here: https://ci.eclipse.org/gemoc/job/gemoc-studio/job/master/)
  - in the same workspace, import the plugins from the "behavioral-interface" branch of the https://github.com/gemoc/gemoc-studio-modeldebugging-eclipsefork repository and the arduino and state machine language projects of this repository
  - create and launch a new Eclipse Application launch configuration configured to run the "org.eclipse.gemoc.gemoc_studio.branding.gemoc_studio" product
  - in the workspace of the newly launched GEMOC Studio, import the arduino and state machine test projects of this repository
  - to open the event management GUI, go to Window > Show View > Other... and search for "Event Manager"
  - different launch configurations for test suites and individual model executions are available in the two projects
