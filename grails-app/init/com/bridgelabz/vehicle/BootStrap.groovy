package com.bridgelabz.vehicle

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    MakeService makeService
    ModelService modelService
    VehicleService vehicleService

        
    
    def init = { servletContext ->
    Make tata = makeService.save( 'Tata')
        Make honda = makeService.save('Honda')
        Make kia = makeService.save('Kia')

        Model winger = modelService.save('Winger', tata)
        Model amaze = modelService.save('Amaze', honda)
        Model carnival = modelService.save('Carnival', kia)

        vehicleService.save('Pickup', tata, winger, 2012).save()
        vehicleService.save('Economy', honda, amaze, 2014).save()
        vehicleService.save('Minivan', kia, carnival, 1990).save()
    
    }
    def destroy = {
    }
}
