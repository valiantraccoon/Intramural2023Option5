package org.firstinspires.ftc.teamcode.Projects;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DigitalChannel;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;

public class ProjectPenne extends Project{

    //Sample project file/hardware map


    //Setup motors

    public DcMotor backright = null;
    public DcMotor backleft = null;

    public DigitalChannel slideSwitch = null;


    public WebcamName camera = null;

    @Override
    public void init(HardwareMap ahwMap) {
        //Save reference to Hardware map
        hwMap = ahwMap;


        //Define and Initialize Motors

        backright = hwMap.dcMotor.get("backright"); //port c0
        backleft = hwMap.dcMotor.get("backleft"); //port e3



        slideSwitch = hwMap.digitalChannel.get("switch");

        //Setup Motor directions and Encoder settings

        backright.setDirection(DcMotor.Direction.FORWARD);
        backleft.setDirection(DcMotor.Direction.REVERSE);

        backright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backleft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Set all motors to zero power
        Stop();
    }

    public void Stop(){

        backright.setPower(0);
        backleft.setPower(0);



    }
}