package less.stupid.opta

import play.api.libs.json._

class OptaPlayerFixtureStats(val fixtureId: String,
                             val matchMinute: Int,
                             val startPosition: String,
                             val subPosition: String,
                             val currentPosition: String,
                             val shirtNo: String,
                             val status: String,
                             val isCaptain: Boolean,
                             val isInPlay: Boolean,
                             val accurateBackZonePass: Int,
                             val accurateChippedPass: Int,
                             val accurateCornersIntobox: Int,
                             val accurateCross: Int,
                             val accurateCrossNocorner: Int,
                             val accurateFlickOn: Int,
                             val accurateFreekickCross: Int,
                             val accurateFwdZonePass: Int,
                             val accurateGoalKicks: Int,
                             val accurateKeeperSweeper: Int,
                             val accurateKeeperThrows: Int,
                             val accurateLaunches: Int,
                             val accurateLayoffs: Int,
                             val accurateLongBalls: Int,
                             val accuratePass: Int,
                             val accuratePullBack: Int,
                             val accurateThroughBall: Int,
                             val accurateThrows: Int,
                             val aerialLost: Int,
                             val aerialWon: Int,
                             val assistAttemptSaved: Int,
                             val assistBlockedShot: Int,
                             val assistFreeKickWon: Int,
                             val assistHandballWon: Int,
                             val assistOwnGoal: Int,
                             val assistPassLost: Int,
                             val assistPenaltyWon: Int,
                             val assistPost: Int,
                             val attAssistOpenplay: Int,
                             val attAssistSetplay: Int,
                             val attBxCentre: Int,
                             val attBxLeft: Int,
                             val attBxRight: Int,
                             val attCmissHigh: Int,
                             val attCmissHighLeft: Int,
                             val attCmissHighRight: Int,
                             val attCmissLeft: Int,
                             val attCmissRight: Int,
                             val attFastbreak: Int,
                             val attFreekickGoal: Int,
                             val attFreekickMiss: Int,
                             val attFreekickPost: Int,
                             val attFreekickTarget: Int,
                             val attFreekickTotal: Int,
                             val attGoalHighCentre: Int,
                             val attGoalHighLeft: Int,
                             val attGoalHighRight: Int,
                             val attGoalLowCentre: Int,
                             val attGoalLowLeft: Int,
                             val attGoalLowRight: Int,
                             val attHdGoal: Int,
                             val attHdMiss: Int,
                             val attHdPost: Int,
                             val attHdTarget: Int,
                             val attHdTotal: Int,
                             val attIboxBlocked: Int,
                             val attIboxGoal: Int,
                             val attIboxMiss: Int,
                             val attIboxPost: Int,
                             val attIboxTarget: Int,
                             val attLfGoal: Int,
                             val attLfTarget: Int,
                             val attLfTotal: Int,
                             val attLgCentre: Int,
                             val attMissHigh: Int,
                             val attMissHighLeft: Int,
                             val attMissHighRight: Int,
                             val attMissLeft: Int,
                             val attMissRight: Int,
                             val attOboxBlocked: Int,
                             val attOboxGoal: Int,
                             val attOboxMiss: Int,
                             val attOboxPost: Int,
                             val attOboxTarget: Int,
                             val attObpGoal: Int,
                             val attObxCentre: Int,
                             val attObxLeft: Int,
                             val attObxRight: Int,
                             val attObxdLeft: Int,
                             val attObxdRight: Int,
                             val attOneOnOne: Int,
                             val attOpenplay: Int,
                             val attPenGoal: Int,
                             val attPenMiss: Int,
                             val attPenPost: Int,
                             val attPenTarget: Int,
                             val attPostHigh: Int,
                             val attPostLeft: Int,
                             val attPostRight: Int,
                             val attRfGoal: Int,
                             val attRfTarget: Int,
                             val attRfTotal: Int,
                             val attSetpiece: Int,
                             val attSvHighCentre: Int,
                             val attSvHighLeft: Int,
                             val attSvHighRight: Int,
                             val attSvLowCentre: Int,
                             val attSvLowLeft: Int,
                             val attSvLowRight: Int,
                             val attemptedTackleFoul: Int,
                             val attemptsConcededIbox: Int,
                             val attemptsConcededObox: Int,
                             val backwardPass: Int,
                             val ballRecovery: Int,
                             val bigChanceCreated: Int,
                             val bigChanceMissed: Int,
                             val bigChanceScored: Int,
                             val blockedCross: Int,
                             val blockedPass: Int,
                             val blockedScoringAtt: Int,
                             val challengeLost: Int,
                             val cleanSheet: Int,
                             val clearanceOffLine: Int,
                             val cornerTaken: Int,
                             val crossNotClaimed: Int,
                             val crosses18yard: Int,
                             val crosses18yardplus: Int,
                             val dangerousPlay: Int,
                             val dispossessed: Int,
                             val diveCatch: Int,
                             val diveSave: Int,
                             val divingSave: Int,
                             val duelLost: Int,
                             val duelWon: Int,
                             val effectiveBlockedCross: Int,
                             val effectiveClearance: Int,
                             val effectiveHeadClearance: Int,
                             val errorLeadToGoal: Int,
                             val errorLeadToShot: Int,
                             val finalThirdEntries: Int,
                             val fkFoulLost: Int,
                             val fkFoulWon: Int,
                             val formationPlace: Int,
                             val foulThrowIn: Int,
                             val fouledFinalThird: Int,
                             val fouls: Int,
                             val freekickCross: Int,
                             val fwdPass: Int,
                             val gameStarted: Int,
                             val gkSmother: Int,
                             val goalAssist: Int,
                             val goalAssistDeadball: Int,
                             val goalAssistIntentional: Int,
                             val goalAssistOpenplay: Int,
                             val goalAssistSetplay: Int,
                             val goalFastbreak: Int,
                             val goalKicks: Int,
                             val goals: Int,
                             val goalsConceded: Int,
                             val goalsConcededIbox: Int,
                             val goalsConcededObox: Int,
                             val goalsOpenplay: Int,
                             val goodHighClaim: Int,
                             val handBall: Int,
                             val headClearance: Int,
                             val headPass: Int,
                             val hitWoodwork: Int,
                             val interception: Int,
                             val interceptionWon: Int,
                             val interceptionsInBox: Int,
                             val keeperPickUp: Int,
                             val keeperThrows: Int,
                             val lastManTackle: Int,
                             val leftsidePass: Int,
                             val longPassOwnToOpp: Int,
                             val longPassOwnToOppSuccess: Int,
                             val lostCorners: Int,
                             val minsPlayed: Int,
                             val offsideProvoked: Int,
                             val offtargetAttAssist: Int,
                             val ontargetAttAssist: Int,
                             val ontargetScoringAtt: Int,
                             val openPlayPass: Int,
                             val outfielderBlock: Int,
                             val overrun: Int,
                             val ownGoals: Int,
                             val passesLeft: Int,
                             val passesRight: Int,
                             val penAreaEntries: Int,
                             val penGoalsConceded: Int,
                             val penaltyConceded: Int,
                             val penaltyFaced: Int,
                             val penaltySave: Int,
                             val penaltyWon: Int,
                             val possLostAll: Int,
                             val possLostCtrl: Int,
                             val possWonAtt3rd: Int,
                             val possWonDef3rd: Int,
                             val possWonMid3rd: Int,
                             val postScoringAtt: Int,
                             val punches: Int,
                             val putThrough: Int,
                             val redCard: Int,
                             val rightsidePass: Int,
                             val savedIbox: Int,
                             val savedObox: Int,
                             val saves: Int,
                             val secondGoalAssist: Int,
                             val secondYellow: Int,
                             val shieldBallOop: Int,
                             val shotFastbreak: Int,
                             val shotOffTarget: Int,
                             val sixYardBlock: Int,
                             val standCatch: Int,
                             val standSave: Int,
                             val successfulFinalThirdPasses: Int,
                             val successfulOpenPlayPass: Int,
                             val successfulPutThrough: Int,
                             val totalAttAssist: Int,
                             val totalBackZonePass: Int,
                             val totalChippedPass: Int,
                             val totalClearance: Int,
                             val totalContest: Int,
                             val totalCornersIntobox: Int,
                             val totalCross: Int,
                             val totalCrossNocorner: Int,
                             val totalFastbreak: Int,
                             val totalFinalThirdPasses: Int,
                             val totalFlickOn: Int,
                             val totalFwdZonePass: Int,
                             val totalHighClaim: Int,
                             val totalKeeperSweeper: Int,
                             val totalLaunches: Int,
                             val totalLayoffs: Int,
                             val totalLongBalls: Int,
                             val totalOffside: Int,
                             val totalPass: Int,
                             val totalPullBack: Int,
                             val totalScoringAtt: Int,
                             val totalSubOff: Int,
                             val totalSubOn: Int,
                             val totalTackle: Int,
                             val totalThroughBall: Int,
                             val totalThrows: Int,
                             val touches: Int,
                             val touchesInOppBox: Int,
                             val turnover: Int,
                             val unsuccessfulTouch: Int,
                             val wasFouled: Int,
                             val wonContest: Int,
                             val wonCorners: Int,
                             val wonTackle: Int,
                             val yellowCard: Int)

object OptaPlayerFixtureStats {

  implicit val opfsReads: Reads[OptaPlayerFixtureStats] = new Reads[OptaPlayerFixtureStats] {

    def reads(json: JsValue): JsResult[OptaPlayerFixtureStats] =
      JsSuccess(
        new OptaPlayerFixtureStats(
          (json \ "fixtureId").get.as[String],
          (json \ "matchMinute").get.as[Int],
          (json \ "startPosition").get.as[String],
          (json \ "subPosition").get.as[String],
          (json \ "currentPosition").get.as[String],
          (json \ "shirtNo").get.as[String],
          (json \ "status").get.as[String],
          (json \ "isCaptain").get.as[Boolean],
          (json \ "isInPlay").get.as[Boolean],
          (json \ "accurateBackZonePass").get.as[Int],
          (json \ "accurateChippedPass").get.as[Int],
          (json \ "accurateCornersIntobox").get.as[Int],
          (json \ "accurateCross").get.as[Int],
          (json \ "accurateCrossNocorner").get.as[Int],
          (json \ "accurateFlickOn").get.as[Int],
          (json \ "accurateFreekickCross").get.as[Int],
          (json \ "accurateFwdZonePass").get.as[Int],
          (json \ "accurateGoalKicks").get.as[Int],
          (json \ "accurateKeeperSweeper").get.as[Int],
          (json \ "accurateKeeperThrows").get.as[Int],
          (json \ "accurateLaunches").get.as[Int],
          (json \ "accurateLayoffs").get.as[Int],
          (json \ "accurateLongBalls").get.as[Int],
          (json \ "accuratePass").get.as[Int],
          (json \ "accuratePullBack").get.as[Int],
          (json \ "accurateThroughBall").get.as[Int],
          (json \ "accurateThrows").get.as[Int],
          (json \ "aerialLost").get.as[Int],
          (json \ "aerialWon").get.as[Int],
          (json \ "assistAttemptSaved").get.as[Int],
          (json \ "assistBlockedShot").get.as[Int],
          (json \ "assistFreeKickWon").get.as[Int],
          (json \ "assistHandballWon").get.as[Int],
          (json \ "assistOwnGoal").get.as[Int],
          (json \ "assistPassLost").get.as[Int],
          (json \ "assistPenaltyWon").get.as[Int],
          (json \ "assistPost").get.as[Int],
          (json \ "attAssistOpenplay").get.as[Int],
          (json \ "attAssistSetplay").get.as[Int],
          (json \ "attBxCentre").get.as[Int],
          (json \ "attBxLeft").get.as[Int],
          (json \ "attBxRight").get.as[Int],
          (json \ "attCmissHigh").get.as[Int],
          (json \ "attCmissHighLeft").get.as[Int],
          (json \ "attCmissHighRight").get.as[Int],
          (json \ "attCmissLeft").get.as[Int],
          (json \ "attCmissRight").get.as[Int],
          (json \ "attFastbreak").get.as[Int],
          (json \ "attFreekickGoal").get.as[Int],
          (json \ "attFreekickMiss").get.as[Int],
          (json \ "attFreekickPost").get.as[Int],
          (json \ "attFreekickTarget").get.as[Int],
          (json \ "attFreekickTotal").get.as[Int],
          (json \ "attGoalHighCentre").get.as[Int],
          (json \ "attGoalHighLeft").get.as[Int],
          (json \ "attGoalHighRight").get.as[Int],
          (json \ "attGoalLowCentre").get.as[Int],
          (json \ "attGoalLowLeft").get.as[Int],
          (json \ "attGoalLowRight").get.as[Int],
          (json \ "attHdGoal").get.as[Int],
          (json \ "attHdMiss").get.as[Int],
          (json \ "attHdPost").get.as[Int],
          (json \ "attHdTarget").get.as[Int],
          (json \ "attHdTotal").get.as[Int],
          (json \ "attIboxBlocked").get.as[Int],
          (json \ "attIboxGoal").get.as[Int],
          (json \ "attIboxMiss").get.as[Int],
          (json \ "attIboxPost").get.as[Int],
          (json \ "attIboxTarget").get.as[Int],
          (json \ "attLfGoal").get.as[Int],
          (json \ "attLfTarget").get.as[Int],
          (json \ "attLfTotal").get.as[Int],
          (json \ "attLgCentre").get.as[Int],
          (json \ "attMissHigh").get.as[Int],
          (json \ "attMissHighLeft").get.as[Int],
          (json \ "attMissHighRight").get.as[Int],
          (json \ "attMissLeft").get.as[Int],
          (json \ "attMissRight").get.as[Int],
          (json \ "attOboxBlocked").get.as[Int],
          (json \ "attOboxGoal").get.as[Int],
          (json \ "attOboxMiss").get.as[Int],
          (json \ "attOboxPost").get.as[Int],
          (json \ "attOboxTarget").get.as[Int],
          (json \ "attObpGoal").get.as[Int],
          (json \ "attObxCentre").get.as[Int],
          (json \ "attObxLeft").get.as[Int],
          (json \ "attObxRight").get.as[Int],
          (json \ "attObxdLeft").get.as[Int],
          (json \ "attObxdRight").get.as[Int],
          (json \ "attOneOnOne").get.as[Int],
          (json \ "attOpenplay").get.as[Int],
          (json \ "attPenGoal").get.as[Int],
          (json \ "attPenMiss").get.as[Int],
          (json \ "attPenPost").get.as[Int],
          (json \ "attPenTarget").get.as[Int],
          (json \ "attPostHigh").get.as[Int],
          (json \ "attPostLeft").get.as[Int],
          (json \ "attPostRight").get.as[Int],
          (json \ "attRfGoal").get.as[Int],
          (json \ "attRfTarget").get.as[Int],
          (json \ "attRfTotal").get.as[Int],
          (json \ "attSetpiece").get.as[Int],
          (json \ "attSvHighCentre").get.as[Int],
          (json \ "attSvHighLeft").get.as[Int],
          (json \ "attSvHighRight").get.as[Int],
          (json \ "attSvLowCentre").get.as[Int],
          (json \ "attSvLowLeft").get.as[Int],
          (json \ "attSvLowRight").get.as[Int],
          (json \ "attemptedTackleFoul").get.as[Int],
          (json \ "attemptsConcededIbox").get.as[Int],
          (json \ "attemptsConcededObox").get.as[Int],
          (json \ "backwardPass").get.as[Int],
          (json \ "ballRecovery").get.as[Int],
          (json \ "bigChanceCreated").get.as[Int],
          (json \ "bigChanceMissed").get.as[Int],
          (json \ "bigChanceScored").get.as[Int],
          (json \ "blockedCross").get.as[Int],
          (json \ "blockedPass").get.as[Int],
          (json \ "blockedScoringAtt").get.as[Int],
          (json \ "challengeLost").get.as[Int],
          (json \ "cleanSheet").get.as[Int],
          (json \ "clearanceOffLine").get.as[Int],
          (json \ "cornerTaken").get.as[Int],
          (json \ "crossNotClaimed").get.as[Int],
          (json \ "crosses18yard").get.as[Int],
          (json \ "crosses18yardplus").get.as[Int],
          (json \ "dangerousPlay").get.as[Int],
          (json \ "dispossessed").get.as[Int],
          (json \ "diveCatch").get.as[Int],
          (json \ "diveSave").get.as[Int],
          (json \ "divingSave").get.as[Int],
          (json \ "duelLost").get.as[Int],
          (json \ "duelWon").get.as[Int],
          (json \ "effectiveBlockedCross").get.as[Int],
          (json \ "effectiveClearance").get.as[Int],
          (json \ "effectiveHeadClearance").get.as[Int],
          (json \ "errorLeadToGoal").get.as[Int],
          (json \ "errorLeadToShot").get.as[Int],
          (json \ "finalThirdEntries").get.as[Int],
          (json \ "fkFoulLost").get.as[Int],
          (json \ "fkFoulWon").get.as[Int],
          (json \ "formationPlace").get.as[Int],
          (json \ "foulThrowIn").get.as[Int],
          (json \ "fouledFinalThird").get.as[Int],
          (json \ "fouls").get.as[Int],
          (json \ "freekickCross").get.as[Int],
          (json \ "fwdPass").get.as[Int],
          (json \ "gameStarted").get.as[Int],
          (json \ "gkSmother").get.as[Int],
          (json \ "goalAssist").get.as[Int],
          (json \ "goalAssistDeadball").get.as[Int],
          (json \ "goalAssistIntentional").get.as[Int],
          (json \ "goalAssistOpenplay").get.as[Int],
          (json \ "goalAssistSetplay").get.as[Int],
          (json \ "goalFastbreak").get.as[Int],
          (json \ "goalKicks").get.as[Int],
          (json \ "goals").get.as[Int],
          (json \ "goalsConceded").get.as[Int],
          (json \ "goalsConcededIbox").get.as[Int],
          (json \ "goalsConcededObox").get.as[Int],
          (json \ "goalsOpenplay").get.as[Int],
          (json \ "goodHighClaim").get.as[Int],
          (json \ "handBall").get.as[Int],
          (json \ "headClearance").get.as[Int],
          (json \ "headPass").get.as[Int],
          (json \ "hitWoodwork").get.as[Int],
          (json \ "interception").get.as[Int],
          (json \ "interceptionWon").get.as[Int],
          (json \ "interceptionsInBox").get.as[Int],
          (json \ "keeperPickUp").get.as[Int],
          (json \ "keeperThrows").get.as[Int],
          (json \ "lastManTackle").get.as[Int],
          (json \ "leftsidePass").get.as[Int],
          (json \ "longPassOwnToOpp").get.as[Int],
          (json \ "longPassOwnToOppSuccess").get.as[Int],
          (json \ "lostCorners").get.as[Int],
          (json \ "minsPlayed").get.as[Int],
          (json \ "offsideProvoked").get.as[Int],
          (json \ "offtargetAttAssist").get.as[Int],
          (json \ "ontargetAttAssist").get.as[Int],
          (json \ "ontargetScoringAtt").get.as[Int],
          (json \ "openPlayPass").get.as[Int],
          (json \ "outfielderBlock").get.as[Int],
          (json \ "overrun").get.as[Int],
          (json \ "ownGoals").get.as[Int],
          (json \ "passesLeft").get.as[Int],
          (json \ "passesRight").get.as[Int],
          (json \ "penAreaEntries").get.as[Int],
          (json \ "penGoalsConceded").get.as[Int],
          (json \ "penaltyConceded").get.as[Int],
          (json \ "penaltyFaced").get.as[Int],
          (json \ "penaltySave").get.as[Int],
          (json \ "penaltyWon").get.as[Int],
          (json \ "possLostAll").get.as[Int],
          (json \ "possLostCtrl").get.as[Int],
          (json \ "possWonAtt3rd").get.as[Int],
          (json \ "possWonDef3rd").get.as[Int],
          (json \ "possWonMid3rd").get.as[Int],
          (json \ "postScoringAtt").get.as[Int],
          (json \ "punches").get.as[Int],
          (json \ "putThrough").get.as[Int],
          (json \ "redCard").get.as[Int],
          (json \ "rightsidePass").get.as[Int],
          (json \ "savedIbox").get.as[Int],
          (json \ "savedObox").get.as[Int],
          (json \ "saves").get.as[Int],
          (json \ "secondGoalAssist").get.as[Int],
          (json \ "secondYellow").get.as[Int],
          (json \ "shieldBallOop").get.as[Int],
          (json \ "shotFastbreak").get.as[Int],
          (json \ "shotOffTarget").get.as[Int],
          (json \ "sixYardBlock").get.as[Int],
          (json \ "standCatch").get.as[Int],
          (json \ "standSave").get.as[Int],
          (json \ "successfulFinalThirdPasses").get.as[Int],
          (json \ "successfulOpenPlayPass").get.as[Int],
          (json \ "successfulPutThrough").get.as[Int],
          (json \ "totalAttAssist").get.as[Int],
          (json \ "totalBackZonePass").get.as[Int],
          (json \ "totalChippedPass").get.as[Int],
          (json \ "totalClearance").get.as[Int],
          (json \ "totalContest").get.as[Int],
          (json \ "totalCornersIntobox").get.as[Int],
          (json \ "totalCross").get.as[Int],
          (json \ "totalCrossNocorner").get.as[Int],
          (json \ "totalFastbreak").get.as[Int],
          (json \ "totalFinalThirdPasses").get.as[Int],
          (json \ "totalFlickOn").get.as[Int],
          (json \ "totalFwdZonePass").get.as[Int],
          (json \ "totalHighClaim").get.as[Int],
          (json \ "totalKeeperSweeper").get.as[Int],
          (json \ "totalLaunches").get.as[Int],
          (json \ "totalLayoffs").get.as[Int],
          (json \ "totalLongBalls").get.as[Int],
          (json \ "totalOffside").get.as[Int],
          (json \ "totalPass").get.as[Int],
          (json \ "totalPullBack").get.as[Int],
          (json \ "totalScoringAtt").get.as[Int],
          (json \ "totalSubOff").get.as[Int],
          (json \ "totalSubOn").get.as[Int],
          (json \ "totalTackle").get.as[Int],
          (json \ "totalThroughBall").get.as[Int],
          (json \ "totalThrows").get.as[Int],
          (json \ "touches").get.as[Int],
          (json \ "touchesInOppBox").get.as[Int],
          (json \ "turnover").get.as[Int],
          (json \ "unsuccessfulTouch").get.as[Int],
          (json \ "wasFouled").get.as[Int],
          (json \ "wonContest").get.as[Int],
          (json \ "wonCorners").get.as[Int],
          (json \ "wonTackle").get.as[Int],
          (json \ "yellowCard").get.as[Int]
        )
      )
  }

  implicit val opfsWrites: Writes[OptaPlayerFixtureStats] = new Writes[OptaPlayerFixtureStats] {

    def writes(stats: OptaPlayerFixtureStats): JsValue =
      Json.obj(
        "fixtureId" -> stats.fixtureId,
        "matchMinute" -> stats.matchMinute,
        "startPosition" -> stats.startPosition,
        "subPosition" -> stats.subPosition,
        "currentPosition" -> stats.currentPosition,
        "shirtNo" -> stats.shirtNo,
        "status" -> stats.status,
        "captain" -> stats.isCaptain,
        "accurateBackZonePass" -> stats.accurateBackZonePass,
        "accurateChippedPass" -> stats.accurateChippedPass,
        "accurateCornersIntobox" -> stats.accurateCornersIntobox,
        "accurateCross" -> stats.accurateCross,
        "accurateCrossNocorner" -> stats.accurateCrossNocorner,
        "accurateFlickOn" -> stats.accurateFlickOn,
        "accurateFreekickCross" -> stats.accurateFreekickCross,
        "accurateFwdZonePass" -> stats.accurateFwdZonePass,
        "accurateGoalKicks" -> stats.accurateGoalKicks,
        "accurateKeeperSweeper" -> stats.accurateKeeperSweeper,
        "accurateKeeperThrows" -> stats.accurateKeeperThrows,
        "accurateLaunches" -> stats.accurateLaunches,
        "accurateLayoffs" -> stats.accurateLayoffs,
        "accurateLongBalls" -> stats.accurateLongBalls,
        "accuratePass" -> stats.accuratePass,
        "accuratePullBack" -> stats.accuratePullBack,
        "accurateThroughBall" -> stats.accurateThroughBall,
        "accurateThrows" -> stats.accurateThrows,
        "aerialLost" -> stats.aerialLost,
        "aerialWon" -> stats.aerialWon,
        "assistAttemptSaved" -> stats.assistAttemptSaved,
        "assistBlockedShot" -> stats.assistBlockedShot,
        "assistFreeKickWon" -> stats.assistFreeKickWon,
        "assistHandballWon" -> stats.assistHandballWon,
        "assistOwnGoal" -> stats.assistOwnGoal,
        "assistPassLost" -> stats.assistPassLost,
        "assistPenaltyWon" -> stats.assistPenaltyWon,
        "assistPost" -> stats.assistPost,
        "attAssistOpenplay" -> stats.attAssistOpenplay,
        "attAssistSetplay" -> stats.attAssistSetplay,
        "attBxCentre" -> stats.attBxCentre,
        "attBxLeft" -> stats.attBxLeft,
        "attBxRight" -> stats.attBxRight,
        "attCmissHigh" -> stats.attCmissHigh,
        "attCmissHighLeft" -> stats.attCmissHighLeft,
        "attCmissHighRight" -> stats.attCmissHighRight,
        "attCmissLeft" -> stats.attCmissLeft,
        "attCmissRight" -> stats.attCmissRight,
        "attFastbreak" -> stats.attFastbreak,
        "attFreekickGoal" -> stats.attFreekickGoal,
        "attFreekickMiss" -> stats.attFreekickMiss,
        "attFreekickPost" -> stats.attFreekickPost,
        "attFreekickTarget" -> stats.attFreekickTarget,
        "attFreekickTotal" -> stats.attFreekickTotal,
        "attGoalHighCentre" -> stats.attGoalHighCentre,
        "attGoalHighLeft" -> stats.attGoalHighLeft,
        "attGoalHighRight" -> stats.attGoalHighRight,
        "attGoalLowCentre" -> stats.attGoalLowCentre,
        "attGoalLowLeft" -> stats.attGoalLowLeft,
        "attGoalLowRight" -> stats.attGoalLowRight,
        "attHdGoal" -> stats.attHdGoal,
        "attHdMiss" -> stats.attHdMiss,
        "attHdPost" -> stats.attHdPost,
        "attHdTarget" -> stats.attHdTarget,
        "attHdTotal" -> stats.attHdTotal,
        "attIboxBlocked" -> stats.attIboxBlocked,
        "attIboxGoal" -> stats.attIboxGoal,
        "attIboxMiss" -> stats.attIboxMiss,
        "attIboxPost" -> stats.attIboxPost,
        "attIboxTarget" -> stats.attIboxTarget,
        "attLfGoal" -> stats.attLfGoal,
        "attLfTarget" -> stats.attLfTarget,
        "attLfTotal" -> stats.attLfTotal,
        "attLgCentre" -> stats.attLgCentre,
        "attMissHigh" -> stats.attMissHigh,
        "attMissHighLeft" -> stats.attMissHighLeft,
        "attMissHighRight" -> stats.attMissHighRight,
        "attMissLeft" -> stats.attMissLeft,
        "attMissRight" -> stats.attMissRight,
        "attOboxBlocked" -> stats.attOboxBlocked,
        "attOboxGoal" -> stats.attOboxGoal,
        "attOboxMiss" -> stats.attOboxMiss,
        "attOboxPost" -> stats.attOboxPost,
        "attOboxTarget" -> stats.attOboxTarget,
        "attObpGoal" -> stats.attObpGoal,
        "attObxCentre" -> stats.attObxCentre,
        "attObxLeft" -> stats.attObxLeft,
        "attObxRight" -> stats.attObxRight,
        "attObxdLeft" -> stats.attObxdLeft,
        "attObxdRight" -> stats.attObxdRight,
        "attOneOnOne" -> stats.attOneOnOne,
        "attOpenplay" -> stats.attOpenplay,
        "attPenGoal" -> stats.attPenGoal,
        "attPenMiss" -> stats.attPenMiss,
        "attPenPost" -> stats.attPenPost,
        "attPenTarget" -> stats.attPenTarget,
        "attPostHigh" -> stats.attPostHigh,
        "attPostLeft" -> stats.attPostLeft,
        "attPostRight" -> stats.attPostRight,
        "attRfGoal" -> stats.attRfGoal,
        "attRfTarget" -> stats.attRfTarget,
        "attRfTotal" -> stats.attRfTotal,
        "attSetpiece" -> stats.attSetpiece,
        "attSvHighCentre" -> stats.attSvHighCentre,
        "attSvHighLeft" -> stats.attSvHighLeft,
        "attSvHighRight" -> stats.attSvHighRight,
        "attSvLowCentre" -> stats.attSvLowCentre,
        "attSvLowLeft" -> stats.attSvLowLeft,
        "attSvLowRight" -> stats.attSvLowRight,
        "attemptedTackleFoul" -> stats.attemptedTackleFoul,
        "attemptsConcededIbox" -> stats.attemptsConcededIbox,
        "attemptsConcededObox" -> stats.attemptsConcededObox,
        "backwardPass" -> stats.backwardPass,
        "ballRecovery" -> stats.ballRecovery,
        "bigChanceCreated" -> stats.bigChanceCreated,
        "bigChanceMissed" -> stats.bigChanceMissed,
        "bigChanceScored" -> stats.bigChanceScored,
        "blockedCross" -> stats.blockedCross,
        "blockedPass" -> stats.blockedPass,
        "blockedScoringAtt" -> stats.blockedScoringAtt,
        "challengeLost" -> stats.challengeLost,
        "cleanSheet" -> stats.cleanSheet,
        "clearanceOffLine" -> stats.clearanceOffLine,
        "cornerTaken" -> stats.cornerTaken,
        "crossNotClaimed" -> stats.crossNotClaimed,
        "crosses18yard" -> stats.crosses18yard,
        "crosses18yardplus" -> stats.crosses18yardplus,
        "dangerousPlay" -> stats.dangerousPlay,
        "dispossessed" -> stats.dispossessed,
        "diveCatch" -> stats.diveCatch,
        "diveSave" -> stats.diveSave,
        "divingSave" -> stats.divingSave,
        "duelLost" -> stats.duelLost,
        "duelWon" -> stats.duelWon,
        "effectiveBlockedCross" -> stats.effectiveBlockedCross,
        "effectiveClearance" -> stats.effectiveClearance,
        "effectiveHeadClearance" -> stats.effectiveHeadClearance,
        "errorLeadToGoal" -> stats.errorLeadToGoal,
        "errorLeadToShot" -> stats.errorLeadToShot,
        "finalThirdEntries" -> stats.finalThirdEntries,
        "fkFoulLost" -> stats.accurateChippedPass,
        "fkFoulWon" -> stats.fkFoulWon,
        "formationPlace" -> stats.formationPlace,
        "foulThrowIn" -> stats.foulThrowIn,
        "fouledFinalThird" -> stats.fouledFinalThird,
        "fouls" -> stats.fouls,
        "freekickCross" -> stats.freekickCross,
        "fwdPass" -> stats.fwdPass,
        "gameStarted" -> stats.gameStarted,
        "gkSmother" -> stats.gkSmother,
        "goalAssist" -> stats.goalAssist,
        "goalAssistDeadball" -> stats.goalAssistDeadball,
        "goalAssistIntentional" -> stats.goalAssistIntentional,
        "goalAssistOpenplay" -> stats.goalAssistOpenplay,
        "goalAssistSetplay" -> stats.goalAssistSetplay,
        "goalFastbreak" -> stats.goalFastbreak,
        "goalKicks" -> stats.goalKicks,
        "goals" -> stats.goals,
        "goalsConceded" -> stats.goalsConceded,
        "goalsConcededIbox" -> stats.goalsConcededIbox,
        "goalsConcededObox" -> stats.goalsConcededObox,
        "goalsOpenplay" -> stats.goalsOpenplay,
        "goodHighClaim" -> stats.goodHighClaim,
        "handBall" -> stats.handBall,
        "headClearance" -> stats.headClearance,
        "headPass" -> stats.headPass,
        "hitWoodwork" -> stats.hitWoodwork,
        "interception" -> stats.interception,
        "interceptionWon" -> stats.interceptionWon,
        "interceptionsInBox" -> stats.interceptionsInBox,
        "keeperPickUp" -> stats.keeperPickUp,
        "keeperThrows" -> stats.keeperThrows,
        "lastManTackle" -> stats.lastManTackle,
        "leftsidePass" -> stats.leftsidePass,
        "longPassOwnToOpp" -> stats.longPassOwnToOpp,
        "longPassOwnToOppSuccess" -> stats.longPassOwnToOppSuccess,
        "lostCorners" -> stats.lostCorners,
        "minsPlayed" -> stats.minsPlayed,
        "offsideProvoked" -> stats.offsideProvoked,
        "offtargetAttAssist" -> stats.offtargetAttAssist,
        "ontargetAttAssist" -> stats.ontargetAttAssist,
        "ontargetScoringAtt" -> stats.ontargetScoringAtt,
        "openPlayPass" -> stats.openPlayPass,
        "outfielderBlock" -> stats.outfielderBlock,
        "overrun" -> stats.overrun,
        "ownGoals" -> stats.ownGoals,
        "passesLeft" -> stats.passesLeft,
        "passesRight" -> stats.passesRight,
        "penAreaEntries" -> stats.penAreaEntries,
        "penGoalsConceded" -> stats.penGoalsConceded,
        "penaltyConceded" -> stats.penaltyConceded,
        "penaltyFaced" -> stats.penaltyFaced,
        "penaltySave" -> stats.penaltySave,
        "penaltyWon" -> stats.penaltyWon,
        "possLostAll" -> stats.possLostAll,
        "possLostCtrl" -> stats.possLostCtrl,
        "possWonAtt3rd" -> stats.possWonAtt3rd,
        "possWonDef3rd" -> stats.possWonDef3rd,
        "possWonMid3rd" -> stats.possWonMid3rd,
        "postScoringAtt" -> stats.postScoringAtt,
        "punches" -> stats.punches,
        "putThrough" -> stats.putThrough,
        "redCard" -> stats.redCard,
        "rightsidePass" -> stats.rightsidePass,
        "savedIbox" -> stats.savedIbox,
        "savedObox" -> stats.savedObox,
        "saves" -> stats.saves,
        "secondGoalAssist" -> stats.secondGoalAssist,
        "secondYellow" -> stats.secondYellow,
        "shieldBallOop" -> stats.shieldBallOop,
        "shotFastbreak" -> stats.shotFastbreak,
        "shotOffTarget" -> stats.shotOffTarget,
        "sixYardBlock" -> stats.sixYardBlock,
        "standCatch" -> stats.standCatch,
        "standSave" -> stats.standSave,
        "successfulFinalThirdPasses" -> stats.successfulFinalThirdPasses,
        "successfulOpenPlayPass" -> stats.successfulOpenPlayPass,
        "successfulPutThrough" -> stats.successfulPutThrough,
        "totalAttAssist" -> stats.totalAttAssist,
        "totalBackZonePass" -> stats.totalBackZonePass,
        "totalChippedPass" -> stats.totalChippedPass,
        "totalClearance" -> stats.totalClearance,
        "totalContest" -> stats.totalContest,
        "totalCornersIntobox" -> stats.totalCornersIntobox,
        "totalCross" -> stats.totalCross,
        "totalCrossNocorner" -> stats.totalCrossNocorner,
        "totalFastbreak" -> stats.totalFastbreak,
        "totalFinalThirdPasses" -> stats.totalFinalThirdPasses,
        "totalFlickOn" -> stats.totalFlickOn,
        "totalFwdZonePass" -> stats.totalFwdZonePass,
        "totalHighClaim" -> stats.totalHighClaim,
        "totalKeeperSweeper" -> stats.totalKeeperSweeper,
        "totalLaunches" -> stats.totalLaunches,
        "totalLayoffs" -> stats.totalLayoffs,
        "totalLongBalls" -> stats.totalLongBalls,
        "totalOffside" -> stats.totalOffside,
        "totalPass" -> stats.totalPass,
        "totalPullBack" -> stats.totalPullBack,
        "totalScoringAtt" -> stats.totalScoringAtt,
        "totalSubOff" -> stats.totalSubOff,
        "totalSubOn" -> stats.totalSubOn,
        "totalTackle" -> stats.totalTackle,
        "totalThroughBall" -> stats.totalThroughBall,
        "totalThrows" -> stats.totalThrows,
        "touches" -> stats.touches,
        "touchesInOppBox" -> stats.touchesInOppBox,
        "turnover" -> stats.turnover,
        "unsuccessfulTouch" -> stats.unsuccessfulTouch,
        "wasFouled" -> stats.wasFouled,
        "wonContest" -> stats.wonContest,
        "wonCorners" -> stats.wonCorners,
        "wonTackle" -> stats.wonTackle,
        "yellowCard" -> stats.yellowCard,
      )
  }

  implicit val format: Format[OptaPlayerFixtureStats] = Format(opfsReads, opfsWrites)

  def empty() = new OptaPlayerFixtureStats("", 0, "", "", "", "", "", false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
}
